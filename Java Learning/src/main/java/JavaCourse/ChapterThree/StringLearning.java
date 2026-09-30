package JavaCourse.ChapterThree;
import java.lang.*;

public class StringLearning {
    public static void run(){
        // String is immmutable
        String a = "hello";
        a.concat("word");
        System.out.println(a);

        String  b = a.concat("word");
        System.out.println(b);

        // the string constant pool
        String c = "hello";
        String d = "hello";
        System.out.println(c==d);
        String e = new String("hello");
        System.out.println(c == e);
        Boolean f = c.equals(e);
        System.out.println(f);

        // text blocks
        String g = """
                {
                name: "jack sparrow",
                movie: "pirates of carribean sea",
                rating: 8,
                available:true
                }
                """;
        System.out.println(g);

        // write special characters
        String h = " We are the so called \"vikings\" of the north";
        String i =  "it\'s all right";
        System.out.println(h);
        System.out.println(i);
    }

}
