package com.tasikun.moon;

public class ConversionType {
    public static void main(String[] args) {

        //conversion happens when         //type casting/type conversion same
        //1. type compatible
        //2. destination type > source type

        //widering implicit type small to big size
        //narrowing explicit type big to small size

        // 1. widering

        /*byte a = 20;
        double b = a;
        System.out.println(b);*/
        //long a = 20L;
        //float b = a;
        // System.out.println(b);

        long a = 20893465L;  //64 bits
        double b = a;   //32 bits
        System.out.println(b);

        //2. Narrowing
        //need to use bracket due to forcefully put the data
        int c = 99;   // 32 bits
        byte d = (byte) c;  // 8 bits
        System.out.println(d);

        long e = 20L;   // 32 bits
        short f = (short) e;  // 16 bits
        System.out.println(e);

        //Moon


    }
}
