package DAA_EXPERIMENTS.Asignments;
import java.util.Scanner;
public class power_function {
    public static int power(int base, int exponent) {
        if (exponent == 0){
            return 1;
        }
        return base*power(base, exponent-1);
    }
    public static void main(String[] args) {

        System.out.println("Experiment 2 :  Develop a program for implementation of power function and determine that complexity should be O(log n) .");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base  : ");
        int x=sc.nextInt();

        System.out.print("Enter the power of base  : ");
        int y=sc.nextInt();

        int res=power(x,y);

        System.out.println("Result = "+res);

    }
}
