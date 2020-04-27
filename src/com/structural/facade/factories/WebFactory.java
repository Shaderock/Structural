package com.structural.facade.factories;

import com.structural.facade.handlers.SocketHandler;
import com.structural.facade.sockets.SpecialSocket;

import java.io.IOException;

public interface WebFactory
{
    SpecialSocket createSocket(String host, int id) throws IOException;

    SocketHandler createSocketHandler();
}
