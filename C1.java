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
public class C1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
         int a, b , sum ;
    Scanner s = new Scanner(System.in) ;
     System.out.print("Enter first value:  ");
      a = s.nextInt();
      System.out.print("Enter second value:  ");
      b = s.nextInt();
    
    sum = a+b ;
    System.out.println("sum ="+sum) ;

    
    }
    
}
