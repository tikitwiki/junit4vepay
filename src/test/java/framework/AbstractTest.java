package framework;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public abstract class AbstractTest {

    protected abstract String getToken();

    protected abstract String getIdentifier();

    protected abstract IdentifierType getIdentifierType();

    protected final <T extends StandardObject> void submitRequest(String url, T data) throws Exception {
        HttpPost post = new HttpPost(url);
        post.setHeader("Content-type", "application/json");
        switch (getIdentifierType()) {
            case MFO:
                post.setHeader("X-Mfo", getIdentifier());
                break;
            case LOGIN:
                post.setHeader("X-Login", getIdentifier());
                break;
            default:
                throw new IllegalStateException("!");
        }
        post.setHeader("X-Token", TokenGenerator.getToken(data, getToken()));
        post.setEntity(new StringEntity(
                ObjectMapperProvider.getMapper().writeValueAsString(data)
        ));
        String result = null;
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(post)) {
            result = EntityUtils.toString(response.getEntity());
        }
    }

    protected final <T extends StandardObject, R extends StandardObject> R submitRequest(String url, T data, Class<R> resultClass) throws Exception {
        HttpPost post = new HttpPost(url);
        post.setHeader("Content-type", "application/json");
        post.setHeader("accept", "application/json");
        switch (getIdentifierType()) {
            case MFO:
                post.setHeader("X-Mfo", getIdentifier());
                break;
            case LOGIN:
                post.setHeader("X-Login", getIdentifier());
                break;
            default:
                throw new IllegalStateException("!");
        }
        post.setHeader("X-Token", TokenGenerator.getToken(data, getToken()));
        post.setEntity(new StringEntity(
                ObjectMapperProvider.getMapper().writeValueAsString(data)
        ));
        String result = null;
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(post)) {
            result = EntityUtils.toString(response.getEntity());
        }
        R objRes = null;
        if (result != null) {
            objRes = ObjectMapperProvider.getMapper().readValue(result, resultClass);
        }
        return objRes;
    }

}
