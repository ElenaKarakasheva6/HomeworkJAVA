/*
Напишете програма Distance, която изчислява разстоянието от
точка (x,y) до (0,0)
**/

import java.text.DecimalFormat;
import java.util.Scanner;
public class Distance {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number X: ");
        float x = sc.nextFloat();
        System.out.print("Enter first number Y: ");
        float y = sc.nextFloat();

        double result = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.print("The result is: " + df.format(result));
    }
}
