package com.structural;

public class Demonstrator
{
    private ShowCase pattern;

    public Demonstrator(ShowCase pattern)
    {
        this.pattern = pattern;
    }

    public void demonstrate()
    {
        System.out.println("=========================================================");
        System.out.println(pattern.getPatternName());
        pattern.demonstrate();
        System.out.println("=========================================================");
    }

    public void setPattern(ShowCase pattern)
    {
        this.pattern = pattern;
    }
}
