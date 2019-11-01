package com.example.lib;

public class GraphicsObject {
    protected Point Origin;

    public GraphicsObject() {

        Origin = new Point(0,0);

    }

    public void moveTo(int newX, int newY) {

        Origin.x = newX;

        Origin.y = newY;

    }

    public abstract void draw(); // abstract method

    protected void finalize() throws Throwable {

        Origin = null;

        super.finalize();

    }
}
