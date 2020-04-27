package com.structural.decorator;

public class Monocle extends VisionDecorator
{
    public Monocle(Vision vision)
    {
        super(vision);
    }

    @Override
    public void zoomIn()
    {
        super.zoomIn();
        setZoom(getZoom() + 2);
    }

    @Override
    public void zoomOut()
    {
        super.zoomOut();
        setZoom(getZoom() - 2);
    }
}
