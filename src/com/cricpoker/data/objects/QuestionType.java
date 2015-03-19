package com.cricpoker.data.objects;

/**
 * This class represents the type of
 * question that can be asked to the users
 *
 */
public enum QuestionType {
	
	MULTI_VALUED("MULTI_VALUED"),
    SINGLE_VALUED("SINGLE_VALUED"),
    BINARY_VALUED("BINARY_VALUED");

    private final String text;

    /**
     * @param text
     */
    private QuestionType(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}
