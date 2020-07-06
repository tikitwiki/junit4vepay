package framework;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperProvider {

    public static final ObjectMapper getMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.getJsonFactory().setCharacterEscapes(new CustomCharacterEscapes());
        return mapper;
    }

}
