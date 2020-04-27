package com.structural.facade.sockets;

import java.io.IOException;
import java.net.Socket;

public class HttpSocket extends SpecialSocket
{
    public HttpSocket(String host, int id) throws IOException
    {
        super(new Socket(host, 80), id);
        System.out.println("HttpSocket with id = " + id + " created");
    }
}
