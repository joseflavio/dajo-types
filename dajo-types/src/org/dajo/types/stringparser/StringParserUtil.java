package org.dajo.types.stringparser;

public class StringParserUtil {

    static public <T> T safeGetOptional(final String stringValue, final StringParser<T> parser, final T defaultValue) {
        try {
            final ParsedContainer<T> result = parser.parseValue(stringValue);
            if (result != null && result.isAvailable() == true) {
                return result.getParsedValue();
            }
        } catch (Exception e) {
        	// It is a safe implementation, should never cause exceptions
        }
        return defaultValue;
    }

    static public <T> ParsedContainer<T> safeGetMandatory(final String stringValue, final StringParser<T> parser) {
        try {
            final ParsedContainer<T> result = parser.parseValue(stringValue);
            if (result != null) {
                return result;
            }
        } catch (Exception e) {
        	// It is a safe implementation, should never cause exceptions
        }
        return new ParsedContainer<T>();
    }

}// class
