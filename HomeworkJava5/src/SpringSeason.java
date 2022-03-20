/*
Напишете програма SpringSeason, в която дефинирате 2 int
променливи - month & day. Програмата трябва да отпечатва true
ако денят е между 20ти Март (включително) и 20ти Юни
(включително) и false в противен случай. Булева стойност на израза
? „yes” : “false”
**/

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        boolean result;

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        if((day >= 1 && day <= 31) && (month >= 1 && month <= 12))
        {


                if(month == 3 && day >= 20)
                {
                    result = true;
                    System.out.print("The result is: " + result);

                }
                else if(month == 6 && day <= 20)
                {
                    result = true;
                    System.out.print("The result is: " + result);
                }
                else if(month == 3 && day < 20)
                {
                    result = false;
                    System.out.print("The result is: " + result);
                }
                else if(month == 6 && day > 20)
                {
                    result = false;
                    System.out.print("The result is: " + result);
                }
                else if(month > 3 && month < 6)
                {
                    result = true;
                    System.out.print("The result is: " + result);
                }
                else if(month > 6 || month < 3)
                {
                    result = false;
                    System.out.print("The result is: " + result);
                }
        }
    }
}
