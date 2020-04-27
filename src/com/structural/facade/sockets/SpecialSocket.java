package com.structural.facade.sockets;

import java.net.Socket;

public abstract class SpecialSocket
{
    private Socket socket;
    private int id;
    private String input;
    private String output;

    public SpecialSocket(Socket socket, int id)
    {
        this.socket = socket;
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getInput()
    {
        return input;
    }

    public void setInput(String input)
    {
        this.input = input;
    }

    public String getOutput()
    {
        return output;
    }

    public void setOutput(String output)
    {
        this.output = output;
    }

    public Socket getSocket()
    {
        return socket;
    }

    public void setSocket(Socket socket)
    {
        this.socket = socket;
    }
}
