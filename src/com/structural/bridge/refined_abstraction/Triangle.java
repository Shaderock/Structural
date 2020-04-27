package com.structural.bridge.refined_abstraction;

import com.structural.bridge.abstraction.Shape;
import com.structural.bridge.interface_implementation.Editor;

public class Triangle extends Shape
{
    public Triangle(Editor editor)
    {
        super(editor);
        System.out.println("Triangle created");
    }

    @Override
    public void print()
    {
        System.out.print("Triangle is printed");
        getEditor().edit();
    }
}
