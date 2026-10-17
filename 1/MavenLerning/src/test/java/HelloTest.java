import JavaCourse.Hello;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloTest {

    @Test
    void testSayHello(){
        Hello hello = new Hello();
        String result = hello.sayHello();

        assertEquals(result, "hello world");
    }

}
