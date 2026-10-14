package JavaCourse.Chapter4;
// passing Object as parameter

class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}
class ChangePerson{
    static void changeName(Person p ){
        p.name = "Modified";
    }
    static void reassign(Person p){
        p = new Person("A"); // does not affect original
    }
}

public class Objectlearning4 {
    public static void run(){
        Person p1 = new Person("p1");

        ChangePerson.changeName(p1);

        ChangePerson.reassign(p1);
        // reassign will not work , we can check name will not be A
        System.out.println(p1.name);
    }
}
