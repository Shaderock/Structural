package com.structural.adapter;

public class AnimalToTransportAdapter implements Animal
{
    Transport transport;
    public AnimalToTransportAdapter(Transport t)
    {
        transport = t;
    }

    @Override
    public void walk()
    {
        transport.move();
        System.out.println("Horse as ");
        transport.hasDriver();
        System.out.println("Horse walks with a horseman");
    }

    @Override
    public void run()
    {
        transport.move();
        System.out.println("Horse as ");
        transport.hasDriver();
        System.out.println("Horse runs with a horseman");
    }
}
