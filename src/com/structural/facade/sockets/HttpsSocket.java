package com.structural.facade.sockets;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;

public class HttpsSocket extends SpecialSocket
{
    public HttpsSocket(String host, int id) throws IOException
    {
        super(SSLSocketFactory.getDefault().createSocket(host, 443), id);
        System.out.println("HttpsSocket with id = " + id + " created");
    }
}
