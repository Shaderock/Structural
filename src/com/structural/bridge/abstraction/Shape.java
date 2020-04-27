package com.structural.bridge.abstraction;

import com.structural.bridge.interface_implementation.Editor;

public abstract class Shape
{
    private Editor editor;

    public Shape(Editor editor)
    {
        this.editor = editor;
    }

    public abstract void print();

    public Editor getEditor()
    {
        return editor;
    }
}
