import java.util.Scanner;
public class Nine3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter :");
        int x = input.nextInt();
        System.out.println("your Gread is ="+getGrade(x));

        
    }
     public static char getGrade(int x){
        if(x>=80){
            return 'A';
        }
        else if(x>=70){
            return 'B';
        }
        else if(x>=60){
            return 'C';
        }
        else{
            return 'F';
        }
     }
}