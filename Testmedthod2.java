import java.util.Scanner;

public class Testmedthod2{
    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int lastDigit = x % 10;      
            result = result * 10 + lastDigit; 
            x = x / 10;             
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter:");
        int x =input.nextInt();

        reverse(x);
        System.out.println(reverse(x));

    }
}
