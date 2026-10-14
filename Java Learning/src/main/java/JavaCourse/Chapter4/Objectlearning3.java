package JavaCourse.Chapter4;

import java.util.Objects;

// learning Object comparision
class Student{
    String name;
    int age;

    Student( String name , int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o; // typecasting
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Objectlearning3 {

    public static void run(){

        Student s1 = new Student("A" , 12);
        Student s2 = new Student("A" , 12);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
