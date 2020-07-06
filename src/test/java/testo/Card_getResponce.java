package testo;

import com.fasterxml.jackson.annotation.JsonProperty;
import framework.StandardObject;
import lombok.Data;


@Data
public class Card_getResponce extends StandardObject {

    @JsonProperty("status")
    protected Long status;

    @JsonProperty("message")
    protected String message;

    @JsonProperty ("card")
    protected Card  card;






}
