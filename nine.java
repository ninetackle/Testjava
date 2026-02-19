import java.util.Scanner;
public class nine{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = input.nextDouble();

        System.out.println("Enter length:");
        double length = input.nextDouble();

        double area = radius*radius*Math.PI;
        double volum = area*length;
        System.out.println("area="+area);
        System.out.println("volum="+volum);

    }
}