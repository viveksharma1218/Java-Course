package JavaCourse.Chapter4;
// Array of Objects

class Criminals{
    String name;
    int years;
    Criminals(String n , int y){
        this.name = n;
        this.years = y;
    }

    @Override
    public String toString() {
        return "Criminals{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}

public class Objectlearning5 {
     public static void run(){
         Criminals[] list = new Criminals[3];
         list[0] = new Criminals("A" , 586);
         list[1] = new Criminals("B" , 299);
         list [2] = new Criminals("c" , 804);

         for(Criminals c : list){
             System.out.println(c);
         }
     }
}
