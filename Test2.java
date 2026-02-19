import java.util.*;
public class Test2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = input.nextInt();
        double[]number = new double[x];
        System.out.println("you have "+x+" Arrays");
        for(int i=0;i<x;i++){
            System.out.print("Enter number: ");
            number[i]=input.nextDouble();
        }
        System.out.print(Arrays.toString(number));
    }
}