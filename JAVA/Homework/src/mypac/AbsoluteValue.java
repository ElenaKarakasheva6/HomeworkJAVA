/*
     3. Напишете програма, която да показва абсолютната стойност на
    числата: -147, 15, 0, 18, резултата да се отпечатват на един и
    съши ред, с разделение табулация.
   * */

package mypac;

public class AbsoluteValue {
    public static void main(String[] args){
        int a = -147;
        int b = 15;
        int c = 0;
        int d = 18;
        //String format = "\t";
        System.out.print("Your numbers are: \n");
        System.out.println(a + "\t" + b + "\t" + c + "\t" + d);

        System.out.print("\n");
        System.out.print("Your new numbers are: \n");
        System.out.println(Math.abs(a)+ " \t" + Math.abs(b) + "\t" + Math.abs(c) + "\t" + Math.abs(d));
    }
}
