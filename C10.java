/*
thank for watching i know about vcn
*/
import java.util.Scanner;


public class C10 {
    public static void main(String[] args)
    {
    int a , b ;
    Scanner s = new Scanner(System.in) ;
     System.out.print("Enter first value:  ");
      a = s.nextInt();
      System.out.print("Enter second value:  ");
      b = s.nextInt();
    System.out.println("values before swaping  a =\t"+a+"\t b= \t"+b ) ;
             a=a+b ;
             b=a-b ;
             a=a-b ;
             System.out.println("values after swaping  a =\t"+a+"\t b= \t"+b ) ;
}
}
