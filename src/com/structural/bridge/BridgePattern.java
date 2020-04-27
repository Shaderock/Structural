package com.structural.bridge;

import com.structural.ShowCase;
import com.structural.bridge.abstraction.Shape;
import com.structural.bridge.concrete_implementations.Hatcher;
import com.structural.bridge.concrete_implementations.Painter;
import com.structural.bridge.refined_abstraction.Circle;
import com.structural.bridge.refined_abstraction.Triangle;

public class BridgePattern extends ShowCase
{
    public BridgePattern()
    {
        super("Bridge");
    }

    @Override
    public void demonstrate()
    {
        Shape shape = new Triangle((new Painter()));
        Shape shape1 = new Circle((new Hatcher()));
        shape.print();
        shape1.print();
    }
}
