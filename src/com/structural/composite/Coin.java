package com.structural.composite;

public class Coin implements ValuableThing
{
    @Override
    public void showValue()
    {
        System.out.println("A single gold coin");
    }
}
