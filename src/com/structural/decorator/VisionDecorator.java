package com.structural.decorator;

public class VisionDecorator implements Vision
{

    Vision vision;

    public VisionDecorator(Vision vision)
    {
        this.vision = vision;
    }

    @Override
    public void zoomIn()
    {
        vision.zoomIn();
    }

    @Override
    public void zoomOut()
    {
        vision.zoomOut();
    }

    @Override
    public double getZoom()
    {
        return vision.getZoom();
    }

    @Override
    public void setZoom(double value)
    {
        vision.setZoom(value);
    }

}
