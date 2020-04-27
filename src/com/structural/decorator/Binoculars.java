package com.structural.decorator;

public class Binoculars extends VisionDecorator
{
    public Binoculars(Vision vision)
    {
        super(vision);
    }

    @Override
    public void zoomIn()
    {
        super.zoomIn();
        setZoom(getZoom() + 20);
    }

    @Override
    public void zoomOut()
    {
        super.zoomOut();
        setZoom(getZoom() - 20);
    }
}
