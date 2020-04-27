package com.structural;

public abstract class ShowCase
{

    private final String patternName;

    public ShowCase(String patternName)
    {
        this.patternName = patternName;
    }

    public abstract void demonstrate();

    public String getPatternName()
    {
        return patternName;
    }
}
