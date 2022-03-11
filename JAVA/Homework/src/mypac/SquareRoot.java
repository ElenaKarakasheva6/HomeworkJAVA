/*
    4. Напишете програма, която изчислява корен квадратен на
    числата: 8, 353, 78, 3, -67, 723, 2000, -100, резултатите да се
    отпечатват на един и същи ред.
   * */

package mypac;

public class SquareRoot {
    public static void main(String[] args){
        int a = 8;
        int b = 353;
        int c = 78;
        int d = 3;
        int e = -67;
        int f = 723;
        int g = 2000;
        int h = -100;
        System.out.println("The square roots of numbers \n");
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " are \n");
        System.out.println(Math.sqrt(a) + "  " + Math.sqrt(b) + "  " + Math.sqrt(c) + "  " + Math.sqrt(d) + "  "
                + Math.sqrt(e) + "  " + Math.sqrt(f) + "  " + Math.sqrt(g) + "  " + Math.sqrt(h));
    }
}
