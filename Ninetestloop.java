import java.util.Scanner;

public class Ninetestloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your score:");
        int x = input.nextInt();
        while(x!=-1){
            if(x>=60){
                System.out.println("you pass exam");
            }
            else{
                System.out.println("you don't pass exam");
            }
            System.out.print("Enter your score:");
            x =input.nextInt();
        }
        System.out.println("Exit program");

    }
}
