package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

                retangle rect1 = new retangle();
                retangle rect2 = new retangle(10,15);
                retangle rect3 = new retangle(rect1);
                rect1.show();
                rect1.area();
                rect1.drawrect();
                rect2.show();
                rect2.area();
                rect2.drawrect();
                rect3.show();
                rect3.area();
                rect3.drawrect();

    }
}
