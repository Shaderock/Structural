package com.structural.bridge.refined_abstraction;

import com.structural.bridge.abstraction.Shape;
import com.structural.bridge.interface_implementation.Editor;

public class Circle extends Shape
{
    public Circle(Editor editor)
    {
        super(editor);
        System.out.println("Circle created");
    }

    @Override
    public void print()
    {
        System.out.print("Circle is printed");
        getEditor().edit();
    }
}
