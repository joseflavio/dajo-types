package org.dajo.types.stringparser;

public interface StringParser<T> {

	ParsedContainer<T> parseValue(String stringValue) throws Exception;

}
