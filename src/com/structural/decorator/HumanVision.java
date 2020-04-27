package com.structural.decorator;

public class HumanVision implements Vision
{
    double zoom;

    public HumanVision()
    {
        zoom = 1;
    }

    @Override
    public void zoomIn()
    {
        zoom += 0.25;
    }

    @Override
    public void zoomOut()
    {
        zoom -= 0.25;
    }

    @Override
    public double getZoom()
    {
        return zoom;
    }

    @Override
    public void setZoom(double value)
    {
        zoom = value;
    }

}
