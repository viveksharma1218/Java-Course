package JavaCourse.ChapterOne;

public class TC2 {
    public static void  run(){
        // let's learn type casting : we have to manually order type change
        // otherwise type will not change

        double a = 5.5;
        int b = (int)a;
        // there is value loss , that's why we have to type caste

        double c = 4.4;
        float d = (float)c;

        long e = 4l;
        int f = (int)e;

        int g = 4;
        byte h = (byte)g;

        double pi = 3.141592653589793;
        float floatpi = (float)pi;
        // now value is 3.1415927

        System.out.println("if we are not seeing any error then we successfullty implemented type casting");

    }
}
