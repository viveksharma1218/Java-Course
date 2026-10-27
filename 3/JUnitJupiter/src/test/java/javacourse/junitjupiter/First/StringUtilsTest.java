package javacourse.junitjupiter.First;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    private final StringUtils strUtils = new StringUtils();

    @Test
    @DisplayName("reverse string test")
    public void reverseStringTest(){
        assertEquals("olleh", strUtils.reverse("hello"));
    }

    @Test
    @DisplayName("pallindrom")
    public void pallindromTest(){
        assertTrue(strUtils.isPalindrome("racecar"));
    }
    @Test
    @DisplayName("Count Vowels ")
    public void countVowels(){
        assertEquals(2 , strUtils.countVowells("hello"));
    }
}
