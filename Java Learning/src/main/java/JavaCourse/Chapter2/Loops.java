package JavaCourse.Chapter2;

public class Loops {

    // let's practice Loops
    public static void run(){
        //Basic for loop
        for(int i=0;i<=10;i++){
            System.out.println("Basic for loop Counting 1 to 10"+ " - " + i);
        }

        // Enhanced for loop
        String[] languages = {"JavaScript","Html","CSS"};
        for( String lan : languages){
            System.out.println("Enhaced for loop Output" + " - " + lan);
        }

        // while loop
        int count = 10;
        while(count > 0){
            System.out.println("while loop output" + " - " + count);
            count--;
        }

        // do while loop
        do{
            System.out.println("output of do while loop");
        }while (false);
    }
}
