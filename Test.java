import java.util.*;
public class Test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("pls Enter array;");
        int x = input.nextInt();

        int[]number = new int[x];
        System.out.println("ได้สร้างarray ขนาด ;"+x);
        for(int i= 0;i<x;i++){
            System.out.println("ใส่ตัวเลขช่องที่"+i+ ": ");
            number[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(number));
    }
}