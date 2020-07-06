package framework;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.codec.digest.DigestUtils;

public class TokenGenerator {

    public static final <T extends StandardObject> String getToken(T data, String key) throws Exception {
        String json = ObjectMapperProvider.getMapper().writeValueAsString(data);
        String jsonSha1 = DigestUtils.sha1Hex(json);
        String keySha1 = DigestUtils.sha1Hex(key);
        String digest = DigestUtils.sha1Hex(keySha1+jsonSha1);
        return digest;
    }

}
