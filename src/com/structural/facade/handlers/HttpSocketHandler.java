package com.structural.facade.handlers;

import com.structural.facade.factories.WebFactory;
import com.structural.facade.sockets.SpecialSocket;

import java.io.IOException;
import java.net.Socket;

public class HttpSocketHandler extends SocketHandler
{

    public HttpSocketHandler()
    {
        super();
        System.out.println("HttpSocketHandler created");
    }

    @Override
    public SpecialSocket createSocket(WebFactory webFactory, String host) throws IOException
    {
        SpecialSocket specialSocket;
        specialSocket = webFactory.createSocket(host, getNextSocketId());
        setNextSocketId(getNextSocketId() + 1);
        return specialSocket;
    }
}
