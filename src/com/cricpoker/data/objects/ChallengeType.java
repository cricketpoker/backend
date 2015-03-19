package com.cricpoker.data.objects;

public enum ChallengeType {

	TOURNAMENT("TOURNAMENT"),
    TEAM("TEAM"),
    MATCH("MATCH");

    private final String text;

    /**
     * @param text
     */
    private ChallengeType(final String text) {
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
