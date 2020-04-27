package com.structural.bridge.concrete_implementations;

import com.structural.bridge.interface_implementation.Editor;

public class Hatcher implements Editor
{
    @Override
    public void edit()
    {
        System.out.println(" and hatched by Hatcher");
    }
}
