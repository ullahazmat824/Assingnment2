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
public class C2 { 
    public static void main(String[] args)
    {
         int a, b ;
          double avg ;
    Scanner s = new Scanner(System.in) ;
     System.out.print("Enter first value:  ");
      a = s.nextInt();
      System.out.print("Enter second value:  ");
      b = s.nextInt();
    
    avg = (a+b)/2.0 ;
    System.out.println("average ="+avg) ;

    
    }
    
}
