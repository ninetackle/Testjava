import java.util.*;
public class Test4{
    public static void main(String[] args) {
        double [][]x=getArray();
        for(int rows = 0;rows<x.length;rows++){
            double total= 0;
            for(int col=0;col<x[rows].length;col++){
                total+=x[rows][col];
            }
            System.out.println(total);
        }
    }
    public static double [][] getArray(){
        Scanner input = new Scanner(System.in);
        double [][]x = new double[3][4];
        System.out.println("Enter " + (x.length * x[0].length) + " numbers: ");
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){
                x[i][j]=input.nextDouble();
            }
        }
        return x;
    }
}