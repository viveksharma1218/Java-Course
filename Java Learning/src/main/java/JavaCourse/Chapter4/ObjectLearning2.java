package JavaCourse.Chapter4;

// access object variables

class Counter{
    static int count = 0;  // static variable
    int id ;
    Counter(){
        count++;
        id = count;
    }
}

public class ObjectLearning2 {
    public static void run(){

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(Counter.count);

        System.out.println(c1.id);
        System.out.println(c2.id);
    }
}
