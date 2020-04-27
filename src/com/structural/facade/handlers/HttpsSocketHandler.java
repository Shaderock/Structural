package com.structural.facade.handlers;

import com.structural.facade.factories.WebFactory;
import com.structural.facade.sockets.SpecialSocket;

import java.io.IOException;

public class HttpsSocketHandler extends SocketHandler
{

    public HttpsSocketHandler()
    {
        super();
        System.out.println("HttpsSocketHandler created");
    }

    @Override
    public SpecialSocket createSocket(WebFactory webFactory, String host) throws IOException
    {
        SpecialSocket socket;
        socket = webFactory.createSocket(host, getNextSocketId());
        setNextSocketId(getNextSocketId() + 1);
        return socket;
    }
}
