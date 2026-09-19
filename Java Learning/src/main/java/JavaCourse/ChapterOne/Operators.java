package JavaCourse.ChapterOne;

public class Operators {
    public static void run(){
        // Arithmetic Operators
        int a = 3;
        int b = 4;

        int c = a + b; // 7
        int d = b - a; // 1
        int e = a * b; // 12
        int f = b / a; //1

        double g = 20;
        int h = 3;
        double i = g / h;  // output 16.666666666666667

        // how to get decimal results

        int j = 13;
        double k = 4;
        System.out.println( j / k);  // you will get decimal result
        // other way
        int l = 13;
        int m = 4;
        System.out.println((double) l / m); // you will get decimal result

        // other way

        int n = 13;
        double o = 4;
        double p = n / o;  // decimal result , you can make n also double

        // Unary operators
        int q = 3;
        int r = q++;  // first assigning the value than doing operation
        int s = q--;   // first assigning the value than doing operation
        System.out.println(r +" "  + s);  // 3 4

        // again
        int t = 3;
        int u = ++r;
        int v = --s;
        System.out.println( u + " "+ v);  // output 4 3

        // logical (not)
        boolean w = true;
        System.out.println("opposite of true : " + !w);

        //  Assignment Operators
        int x = 5;
        x += 2; // equals to x = x +2;
        x -= 3; // equals to x = x -3;
        x /=2; // equalts to x = x /2;


    }
}
