package testo;

import com.fasterxml.jackson.annotation.JsonProperty;
import framework.StandardObject;
import lombok.Data;

@Data
public class OutpaycardResponce extends StandardObject {

    @JsonProperty("status")
    protected Long status;

    @JsonProperty("message")
    protected String message;

    @JsonProperty ("id")
    protected Long id;
}
