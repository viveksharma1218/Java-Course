package JavaCourse.Chapter4;

class Car{
    String name;
    int model;

    void start(){
        System.out.println(name + " : " + model + " Starting ...");
    }

}


public class ObjectLearning {

    public static void run(){
        // let's make our first object
        Car car1 = new Car();
        car1.name = "Audi";
        car1.model = 2026;
        car1.start();

        // we can create many objects with one class

        Car car2 = new Car();
        car2.name = "Honda";
        car2.model = 2025;
        car2.start();

        // both objects are pointing to the same object so if we change something
        // in one ,other will also change
        Car car3 = new Car();
        car3.name = "mahindra";
        Car car4 = car3;
        car4.name = "Tata";
        System.out.println("by changing car4's name , car3 also get affected" +
                " :" + car3.name);
    }
}
