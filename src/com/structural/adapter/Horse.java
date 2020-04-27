package com.structural.adapter;

public class Horse implements Animal
{
    @Override
    public void walk()
    {
        System.out.println("horse walks slowly");
    }

    @Override
    public void run()
    {
        System.out.println("horse runs very fast");
    }
}
