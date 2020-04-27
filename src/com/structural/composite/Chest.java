package com.structural.composite;

import java.util.ArrayList;

public class Chest implements ValuableThing
{

    ArrayList<ValuableThing> valuableThings;

    public Chest()
    {
        valuableThings = new ArrayList<>();
    }

    @Override
    public void showValue()
    {
        System.out.println("A chest contains: ");
        for (ValuableThing valuableThing : valuableThings)
        {
            valuableThing.showValue();
        }
    }

    public void add(ValuableThing valuableThing)
    {
        valuableThings.add(valuableThing);
    }

    public ArrayList<ValuableThing> getValuableThings()
    {
        return valuableThings;
    }
}
