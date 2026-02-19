import java.util.Scanner;

public class Nineif{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter number:");
        int x = input.nextInt();
        int original=x;
        int reversed =0;

        while (x>0){
            int digit =x%10;
            reversed = reversed*10+digit;
            x/=10;
        }
        
        if(reversed==original){
            System.out.println("this number is parlindrome");
        }
        else{
            System.out.println("this number is not parlindrome");
        }

    }
}