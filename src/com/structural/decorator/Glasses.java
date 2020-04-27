package com.structural.decorator;

public class Glasses extends VisionDecorator
{
    public Glasses(Vision vision)
    {
        super(vision);
    }

    @Override
    public void zoomIn()
    {
        super.zoomIn();
        setZoom(getZoom() + 0.75);
    }

    @Override
    public void zoomOut()
    {
        super.zoomOut();
        setZoom(getZoom() - 0.75);
    }

}
