import java.util.Scanner;

public class Nineif2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number:");
        int numnber = input.nextInt();

        if(numnber>0){
            System.out.println("Positive");
        }
        else if(numnber<0){
            System.out.println("Negative");
        }
        else if(numnber==0){
            System.out.println("Zero");
        }
    }
}