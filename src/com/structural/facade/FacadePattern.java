package com.structural.facade;

import com.structural.ShowCase;

import java.io.IOException;

public class FacadePattern extends ShowCase
{

    public FacadePattern()
    {
        super("Facade");
    }

    @Override
    public void demonstrate()
    {
        SocketSenderFacade socketSenderFacade = new SocketSenderFacade();
        try
        {
            socketSenderFacade.sendSimpleGetRequest("utm.md");
            socketSenderFacade.sendSimpleGetRequest("unite.md");
            socketSenderFacade.downloadImages("utm.md", "C/users/downloads");
            socketSenderFacade.downloadImages("unite.md", "C/users/downloads");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
