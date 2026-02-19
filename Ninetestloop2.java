import java.util.Scanner;
public class Ninetestloop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Plese enter number:");
        int student = input.nextInt();
        double min1 = Double.MAX_VALUE; // ต่ำที่สุด
        String name1 = "";
        double min2 = Double.MAX_VALUE; // ต่ำอันดับสอง
        String name2 = "";

        for(int i=0;i<student;i++){
            System.out.print("Enter name:");
            String name =input.next();
            System.out.print("Enter score:");
            double score =input.nextDouble();
            if (score>min1){
                min2=min1;
                name2=name1;

                min1=score;
                name1=name;
            }
            else if(score<min2){
                min2=score;
                name2=name;
            }
        }
        System.out.println("Lowest score: " + name1 + " (" + min1 + ")");
        System.out.println("Second lowest score: " + name2 + " (" + min2 + ")");
        
    }
}