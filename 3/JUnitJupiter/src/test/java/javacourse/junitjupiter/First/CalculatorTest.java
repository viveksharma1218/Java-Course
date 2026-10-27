package javacourse.junitjupiter.First;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    public void setUp(){
        calc = new Calculator();
    }

    @Test
    @DisplayName("Testing Addition")
    public void testAdd(){
        int a = 10;
        int b = 10;
        int result = calc.add(a,b);
    }
}
