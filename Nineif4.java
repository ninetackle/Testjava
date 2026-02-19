import java.util.Scanner;

public class Nineif4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("pls enter number");
        int timer = input.nextInt();
        
        while(timer>0){
            System.out.print("ระเบิดจะทำงานในอีก"+timer);
            timer--;
        }
        System.out.print("boomm");
            
        }
    }
