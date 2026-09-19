package JavaCourse.ChapterOne;

public class Number {
    //lets practice Integer

    // Byte  -128 to 127
    static Byte minByte = -128;
    static Byte maxByte = 127;
    // short: -32,768 to 32,767
    static short maxShort = 32767;
    static short minshort = -32768;
    // int: -2,147,483,648 to 2,147,483,647
    static int maxint = 2147483647;
    static int minint = -2147483648;
    // long: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    static long worldPopulation = 8000000000L;
    //use underscoro for readability
    static int million = 1_000_000;

    public static void run(){

        System.out.println("Byte Max : " + maxByte + " &  ByteMin : " + minByte);
        System.out.println("maximum short : " + maxShort+"  &  Minimum Short : " + minshort);
        System.out.println("maxint : "+ maxint + " & Minint : " + minint);
        System.out.println("Long: " + worldPopulation);
        System.out.println("underscore for readability, Million : " + million);
    }



}
