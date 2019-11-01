package com.example.lib;

public class retangle {

    int width;
    int lenght;

    public retangle(){

        width=4;
        lenght=8;

    }

    public retangle(int wed,int len){

        width=wed;
        lenght=len;

    }

    public  retangle(retangle rect){

        width=rect.width;
        lenght=rect.lenght;

    }

    public void show(){

        System.out.println("width"+width);
        System.out.println("lenght"+lenght);

    }

    public void area(){

        System.out.println("area"+width*lenght);

    }

    public void drawrect(){

        for(int j=0;j<width;j++){

            for(int i=0;i<lenght;i++){

                System.out.print("*");

            }

            System.out.println("");

        }

    }

}
