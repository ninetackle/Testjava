import java.util.*;
public class Test3{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter Rows: ");
        int Rows =input.nextInt();
        System.out.println("Enter col: ");
        int col = input.nextInt();

        double [][]x=new double[Rows][col];

        for(int i=0;i<Rows;i++){
            
            for(int j=0;j<col;j++){
                System.out.print("Enter value for position [" + i + "][" + j + "]: ");
                x[i][j]=input.nextDouble();
            }
        }
        System.out.println(Arrays.deepToString(x));
    }
}