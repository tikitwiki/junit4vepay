package testo;

import com.fasterxml.jackson.annotation.JsonProperty;
import framework.StandardObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Card_getRequest extends StandardObject {
    @JsonProperty("id")
    protected Long id;

    @JsonProperty("type")
    protected Long type;
}
