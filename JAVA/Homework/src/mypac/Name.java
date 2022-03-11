/*
     1. Напишете програма, която отпечатва боят на буквите на
    първото ви име, след това го отпечатайте веднъж само с главни
    букви, и веднъж само с малки
   * */

package mypac;

public class Name {
    public static void main(String[] args){
        String name = "Elena";
        int stringLength = name.length();
        System.out.println("Name length is: " + stringLength);
        System.out.println("Uppercase -> " + name.toUpperCase());
        System.out.println("Lowercase -> " + name.toLowerCase());
    }
}
