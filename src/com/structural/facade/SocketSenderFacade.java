package com.structural.facade;

import com.structural.facade.downloaders.ImageDownloader;
import com.structural.facade.factories.HttpFactory;
import com.structural.facade.factories.HttpsFactory;
import com.structural.facade.factories.WebFactory;
import com.structural.facade.handlers.SocketHandler;
import com.structural.facade.sockets.SpecialSocket;

import java.io.IOException;

public class SocketSenderFacade
{

    public void sendSimpleGetRequest(String webUrl) throws IOException
    {
        SocketHandler socketHandler;
        WebFactory webFactory;
        if (webUrl.contains("utm.md"))
        {
            webFactory = new HttpsFactory();
        }
        else
        {
            webFactory = new HttpFactory();
        }
        socketHandler = webFactory.createSocketHandler();
        SpecialSocket socket = socketHandler.createSocket(webFactory, webUrl);
        socketHandler.sendRequest(socket);
    }

    public void downloadImages(String webUrl, String localFilePath)
    {
        SocketHandler socketHandler;
        WebFactory webFactory;
        if (webUrl.contains("utm.md"))  // some logic to identify http or https here
        {
            webFactory = new HttpsFactory();
        }
        else
        {
            webFactory = new HttpFactory();
        }
        socketHandler = webFactory.createSocketHandler();
        ImageDownloader imageDownloader = new ImageDownloader(socketHandler);
        imageDownloader.getAllImagesPaths();
        imageDownloader.downloadAllImages(webUrl, localFilePath);
    }
}
