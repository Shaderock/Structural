package com.structural.facade.factories;

import com.structural.facade.handlers.HttpSocketHandler;
import com.structural.facade.handlers.HttpsSocketHandler;
import com.structural.facade.handlers.SocketHandler;
import com.structural.facade.sockets.HttpSocket;
import com.structural.facade.sockets.HttpsSocket;
import com.structural.facade.sockets.SpecialSocket;

import java.io.IOException;

public class HttpsFactory implements WebFactory
{


    @Override
    public SpecialSocket createSocket(String host, int id) throws IOException
    {
        return new HttpsSocket(host, id);
    }

    @Override
    public SocketHandler createSocketHandler()
    {
        return new HttpsSocketHandler();
    }
}