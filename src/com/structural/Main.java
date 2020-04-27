package com.structural;

import com.structural.adapter.AdapterPattern;
import com.structural.bridge.BridgePattern;
import com.structural.composite.CompositePattern;
import com.structural.decorator.DecoratorPattern;
import com.structural.facade.FacadePattern;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        showCase();
    }

    public static void showCase()
    {
        ArrayList<ShowCase> showCases = new ArrayList<>();
        showCases.add(new AdapterPattern());
        showCases.add(new DecoratorPattern());
        showCases.add(new CompositePattern());
        showCases.add(new FacadePattern());
        showCases.add(new BridgePattern());

        for (ShowCase showCase : showCases)
        {
            Demonstrator demonstrator = new Demonstrator(showCase);
            demonstrator.demonstrate();
        }
    }
}
