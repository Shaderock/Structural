package com.structural.decorator;

import com.structural.ShowCase;

public class DecoratorPattern extends ShowCase
{

    public DecoratorPattern()
    {
        super("Decorator");
    }

    @Override
    public void demonstrate()
    {
        HumanVision humanVision1 = new HumanVision();
        VisionDecorator visionDecorator1 = new VisionDecorator(humanVision1);
        visionDecorator1 = new Glasses(visionDecorator1);
        visionDecorator1.zoomIn();

        howMuchIsTheZoom(humanVision1);

        HumanVision humanVision2 = new HumanVision();
        VisionDecorator visionDecorator2 = new VisionDecorator(humanVision2);
        visionDecorator2 = new Binoculars(visionDecorator2);
        visionDecorator2.zoomIn();

        howMuchIsTheZoom(humanVision2);

        HumanVision humanVision3 = new HumanVision();
        VisionDecorator visionDecorator3 = new VisionDecorator(humanVision3);
        visionDecorator3 = new Glasses(visionDecorator3);
        visionDecorator3 = new Monocle(visionDecorator3);
        visionDecorator3 = new Binoculars(visionDecorator3);
        visionDecorator3.zoomIn();

        howMuchIsTheZoom(humanVision3);
    }

    public double howMuchIsTheZoom(Vision vision)
    {
        System.out.println("Zoom is " + vision.getZoom());
        return vision.getZoom();
    }
}
