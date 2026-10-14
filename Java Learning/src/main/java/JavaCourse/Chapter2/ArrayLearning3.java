package JavaCourse.Chapter2;

import java.util.Arrays;

public class ArrayLearning3 {
    public static void run(){
        // array copying

        // manual
        int[] a = {3,4,84,93,9382,89473};
        int[] b = new int[6];
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        for(int e : a){
            System.out.println(e);
        }

        // System.arraycopy()  - Fastest
        int[] c = new int[10];
        System.arraycopy(a,0,c,1,a.length - 1);
        System.out.println("System.arraycopy() - Fastes way to copy");
        for(int e : c){
            System.out.print(e + " : ");
        }

        // Arrays.copyof
        int[] d = {44,55,66,77,88,99};
        int[] e = Arrays.copyOf(d,d.length);
        // new copy
        System.out.println("");
        System.out.println("Array.copyof()");
        for(int el : e){
            System.out.print(el + " : ");
        }
        // copy of range
        int[] f = {4,3,9,4,2,9};
        int[] g = Arrays.copyOfRange(f , 0 , 4);
        System.out.println(" ");
        System.out.println("copy of range");
        for(int elm : g) {
            System.out.print(elm + " : ");
        }
        // clone method
        int[] h = { 9,4,2,7,5,6,1,0,3};
        int[] j = h.clone();
        System.out.println("clone method");
        for(int elmn: j){
            System.out.print(elmn + " : ");
        }
        // 2D Array clone
        int[][] k = {{3,4}, {5,6},{7,8}};
        int[][] l = k.clone();
        System.out.println(" clone nested array");
        for(int[] ee: l){
            for (int  eee : ee){
                System.out.print(eee +  " : ");
            }
        }


    }

}
