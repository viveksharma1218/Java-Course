package JavaCourse.Chapter4;
// anonymous object
class Calculator{
    int add(int a, int b){
        return a+b;
    }
}
public class Objectlearning6 {
    public static void run(){
        System.out.println(new Calculator().add(4,5));
    }
}
