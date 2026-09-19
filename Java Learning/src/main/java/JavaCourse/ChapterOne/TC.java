package JavaCourse.ChapterOne;

import org.w3c.dom.ls.LSOutput;

//let's practice Type Conversation and Type Casting
public class TC {
    public static void run(){
        // type Conversation : it happens Automatically
        byte a = 100;
        short b = a;
        // No error and we did not explicitly do nothing for type change.

        short c = 1000;
        int d = c;
        // no error

        int e = 10_000;
        long f = e;
        // no error

        float g = 5.67f;
        double h = g;
        // no error

        // we are not facing any error because we are sending small range value to big range

        char i  = 'A';
        int j = i;
        // java will store 65 value (16 bit numeric value)
        char k = (char)j;
        //  converted into 'A'

        // widening expression
        byte l = 30;
        byte m = 30;
        int n = l * m;
        // automatically type int assigned

        byte o = 8;
        long p = 10000l;
        long q = o + p;

        int r = 5;
        float s = 5.5f;
        float t  = r + s;

        int u = 6;
        double v = 6.6;
        double w = u + v;

        System.out.println("if you are not seeing any error then we successfully implemented" +
                "Type conversion");
    }

}
