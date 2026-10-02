package JavaCourse.Chapter2;

public class ArrayLearning {
    public static void run(){
        // Array declaration
        int[ ] a ;
        // Array instantiation
        int [] b =new int[5];
        // Array initialization
        b[0]= 1;
        b[1] = 3;
        b[2] =  7;
        b[3] = 22;
        b[4] = 98;

        // combined syntax
        int[] c = {3,5,3,7,34,546,4534,74565233};

        // iterating over arrays

        // for loop
        System.out.println("for loop");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i] + " ,");
        }
        // Enhancced for loop
        System.out.println("enhanced for loop ");
        for(int e : c) {
            System.out.print(e + " , ");
        }

        // while loop
        System.out.println("while loop");
        int i = 0 ;
        while(i < c.length){
            System.out.print(c[i]  +  " ,");
            i++;
        }
    }
}
