package framework;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;

public class CustomCharacterEscapes extends CharacterEscapes {

//    private static final Logger log = Logger.getLogger(CustomCharacterEscapes.class);

    private final int[] _asciiEscapes;

    public CustomCharacterEscapes() {
        _asciiEscapes = standardAsciiEscapesForJSON();
        _asciiEscapes['/'] = CharacterEscapes.ESCAPE_CUSTOM;
    }

    @Override
    public int[] getEscapeCodesForAscii() {
        return _asciiEscapes;
    }

    @Override
    public SerializableString getEscapeSequence(int i) {
        switch(i) {
            case '/':
                return new SerializedString("\\/");
            default:
                return null;
        }
    }
}
