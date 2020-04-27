package com.structural.composite;

import com.structural.ShowCase;

import java.util.ArrayList;

public class CompositePattern extends ShowCase
{
    public CompositePattern()
    {
        super("Composite");
    }

    @Override
    public void demonstrate()
    {

        ArrayList<Coin> coins = new ArrayList<>();
        ArrayList<Diamond> diamonds = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            coins.add(new Coin());
            diamonds.add(new Diamond());
        }

        Chest bigChest = new Chest();
        Chest smallChest = new Chest();

        for (Diamond diamond : diamonds)
        {
            bigChest.add(diamond);
        }

        bigChest.add(smallChest);

        for (Coin coin : coins)
        {
            smallChest.add(coin);
        }

        bigChest.showValue();

    }
}
