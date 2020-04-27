package com.structural.facade.factories;

import com.structural.facade.handlers.HttpSocketHandler;
import com.structural.facade.handlers.SocketHandler;
import com.structural.facade.sockets.HttpSocket;
import com.structural.facade.sockets.SpecialSocket;

import java.io.IOException;

public class HttpFactory implements WebFactory
{

    @Override
    public SpecialSocket createSocket(String host, int id) throws IOException
    {
        return new HttpSocket(host, id);
    }

    @Override
    public SocketHandler createSocketHandler()
    {
        return new HttpSocketHandler();
    }
}
