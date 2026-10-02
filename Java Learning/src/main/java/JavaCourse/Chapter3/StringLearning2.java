package JavaCourse.Chapter3;

public class StringLearning2 {
    public static void run(){
        // String Buffer
        StringBuffer SB = new StringBuffer("hello");
        System.out.println(SB);
        SB.append(" word");
        System.out.println(SB);
        SB.insert(5," java");
        System.out.println(SB);
        SB.replace(6, 10 , "python");
        System.out.println(SB);
        SB.delete(5,12);
        System.out.println(SB);
    }
}
