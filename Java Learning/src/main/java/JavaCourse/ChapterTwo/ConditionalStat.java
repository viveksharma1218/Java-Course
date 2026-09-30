package JavaCourse.ChapterTwo;

public class ConditionalStat {
    // let's practice conditional statements

    public static void run(){
        // if else chain
        int marks = 90;
        if(marks >= 80){
            System.out.println("Excellent");
        } else if (marks >= 60 && marks <80) {
            System.out.println("Good");
        }
        else{
            System.out.println("Average");
        }

        int age = 30;
        int income = 75000;
        int creditScore = 720;
        int loanAmount = 2_00_000;
        boolean hasCollateral = true;

        if(age >= 21 && age <= 65 && income >= 30_000 && creditScore >= 500 &&
                (loanAmount <= income*4 || hasCollateral)){
            System.out.println("loan has been approved");
        }
        else{
            System.out.println("loan has been Disapproved");
        }
    }

}
