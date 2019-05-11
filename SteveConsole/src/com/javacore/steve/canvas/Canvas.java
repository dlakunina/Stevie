package com.javacore.steve.canvas;

public abstract class Canvas {

    public abstract void drawText(int row, String text);

    public abstract void drawSquare(int x, int y, int size);

    public abstract void drawCircle(int x, int y, int radius);

    public abstract void finalizeDraw();
}
