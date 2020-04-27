package com.structural.facade.downloaders;

import com.structural.facade.factories.WebFactory;
import com.structural.facade.handlers.SocketHandler;

public class ImageDownloader
{
    SocketHandler socketHandler;

    public ImageDownloader(SocketHandler socketHandler)
    {
        this.socketHandler = socketHandler;
        System.out.println("ImageDownloader created");
    }

    public void getAllImagesPaths()
    {
        System.out.println("Paths of images got");
    }

    public void downloadAllImages(String webUrl, String localFilePath)
    {
        System.out.println("Images from " + webUrl + " downloaded to " + localFilePath);
    }
}
