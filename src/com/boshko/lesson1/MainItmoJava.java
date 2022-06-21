package com.boshko.lesson1;

public class MainItmoJava {

    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // write your code here
        byte b = 100;
        short s = 123;
        int i = 500;
        long l = 5000000000L;
        float f = 12.3f;
        double d = 14.5d;

        char c = 'a';
        boolean isTrue = true;

        byte r = (byte) (b + 1);
        // System.out.println(r);

        long q = b + 1;

        double i1 = i / 3d;
        //System.out.println(i1);

        String string = "Java";
        String str = new String("java");
        // System.out.println(string);

        if (true) {
            //logic
        }

        if (true) {
            //logic
        } else {
            //logic
        }

        if (true) {
            //logic
        } else if (false){
            //logic
        } else if (false){
            //logic
        } else if (false){
            //logic
        } else{

        }

        int x = 10;
        int y = 20;

        // x==y; x!=y; x>y; x<y; x>=y; x<=y; x %2=0

        if (x == y && x > y){
            //logic
        }

        if (((x < y && x == y)) || x > y){
            //logic
        }

        int a = 0;

        String str2 = a == 2 ? "Hello" : a== 3 ? "world" : "wrong number";
        System.out.println(str2);

    }
}
