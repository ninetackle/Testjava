import java.util.Scanner;

public class Nineif3{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("plese enter your number:");
        int score = input.nextInt();
        if(score>=50){
            System.out.println("Pass");
        }
        else if(score<50){
            System.out.println("Fail");
        }
    }
}