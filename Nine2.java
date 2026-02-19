import java.util.Scanner;
public class Nine2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter :");
        int x =input.nextInt();
        for(int i =1;i<=12;i++){
            System.out.println( x + "x "+i+"="+(x*i));
        }
    }
}