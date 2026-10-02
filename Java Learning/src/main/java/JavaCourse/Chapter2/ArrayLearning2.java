package JavaCourse.Chapter2;

public class ArrayLearning2 {
    public static void run(){
        // accessing array elements
        int[] a  = {3,5,2,87,543,43242};
        System.out.println(a[1]);

        // changing element
        a[3] = 5;
        System.out.println(a[3]);

        // index bound
        // this will show error
        // System.out.println(a[55]);

        //safe access
        if(a == null){
            System.out.println("null pointer exception");
        }else{
            // i must be below length
            for(int i = 0; i<a.length; i++){
                System.out.println(a[i]);
            }
        }

        // Array length
        int length = a.length;
        // length of nested Array
        int[][] b = new int [4][6];
        int length1 = b[2].length;
        System.out.println("length : " + length + " : " + length1);


    }
}
