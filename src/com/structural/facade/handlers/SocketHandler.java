package com.structural.facade.handlers;

import com.structural.facade.factories.WebFactory;
import com.structural.facade.sockets.SpecialSocket;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public abstract class SocketHandler
{

    ArrayList<Socket> sockets;
    int nextSocketId;

    public SocketHandler()
    {
        sockets = new ArrayList<>();
        nextSocketId = 0;
    }

    public abstract SpecialSocket createSocket(WebFactory webFactory, String host) throws IOException;

    public void sendRequest(SpecialSocket specialSocket)
    {
        System.out.println("Request sent, response received");
    }

    public void addSocket(Socket socket)
    {
        System.out.println("Socket added");
    }

    public ArrayList<Socket> getSockets()
    {
        return sockets;
    }

    public void setSockets(ArrayList<Socket> sockets)
    {
        this.sockets = sockets;
    }

    public int getNextSocketId()
    {
        return nextSocketId;
    }

    public void setNextSocketId(int nextSocketId)
    {
        this.nextSocketId = nextSocketId;
    }
}
