package com.structural.adapter;

import com.structural.ShowCase;

public class AdapterPattern extends ShowCase
{
    private Transport transport;
    private Horse horse;
    private AnimalToTransportAdapter sledHorse;

    public AdapterPattern()
    {
        super("Adapter");
        transport = new Transport();
        horse = new Horse();
        sledHorse = new AnimalToTransportAdapter(transport);
    }

    @Override
    public void demonstrate()
    {
        transport.move();
        horse.walk();
        horse.run();

        sledHorse.walk();
        sledHorse.run();
    }

}
