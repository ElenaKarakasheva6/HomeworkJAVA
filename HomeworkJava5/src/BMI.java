/*
Направете програма BMI с която да изчислите вашият Body Mass
Index.
**/

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {
    private static final DecimalFormat df = new DecimalFormat("0");
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter mass in kg: ");
        float mass = sc.nextFloat();

        System.out.print("Enter height in metеrs: ");
        float height = sc.nextFloat();

        double result;
        result = mass / (Math.pow(height,2));
        System.out.print("Your BMI is: " + df.format(result));

        if(result <= 25)
        {
            System.out.print("\nYou are normal.");
        }
        else if(result > 25 && result <= 29)
        {
            System.out.print("\nYou are overweight.");
        }
        else if(result >= 30)
        {
            System.out.print("\nYou are obese.");
        }
    }
}
