/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Azmat Chand
 */
import java.util.Scanner ;

public class C3 {
    public static void main(String[] args)
    {
         int a, b ; 
                 double dif;
    Scanner s = new Scanner(System.in) ;
     System.out.print("Enter first value:  ");
      a = s.nextInt();
      System.out.print("Enter second value:  ");
      b = s.nextInt();
    if(a>b)
      dif = a-b ;
    else 
        dif = b-a ;
    System.out.println("difference  ="+dif) ;

    
    }
}
