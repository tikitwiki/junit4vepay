package testo;

import com.fasterxml.jackson.annotation.JsonProperty;
import framework.StandardObject;

public class CardRegResponse extends StandardObject {

    @JsonProperty("status")
    protected Long status;

    @JsonProperty("message")
    protected String message;

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("url")
    protected String url;

}
