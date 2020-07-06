package testo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data

public class Card {
    @JsonProperty("id")
    protected Long id;
    @JsonProperty("num")
    protected String num;
    @JsonProperty("exp")
    protected String exp;
    @JsonProperty("holder")
    protected String holder;


}
