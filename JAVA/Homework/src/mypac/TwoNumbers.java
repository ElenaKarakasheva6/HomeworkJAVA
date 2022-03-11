/*
     2. Напишете програма, която да събира две числа и да отпечатва
резултата в конзолата.
   * */
package mypac;
import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number A: ");
        int a= sc.nextInt();
        System.out.print("Enter second number B: ");
        int b= sc.nextInt();
        int c = a + b;
        System.out.println("A + B = " +c);
    }
}
