/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Azmat Chand
 */
import java.util.Scanner;

public class C9 {
        public static void main(String[] args)
        { Scanner s = new Scanner(System.in) ;
        double a,b , c, d ;
        
        System.out.print("Enter first side:  ");
      a = s.nextDouble();
      System.out.print("Enter second side:  ");
      b = s.nextDouble();
      System.out.print("Enter third side:  ");
      c = s.nextDouble();
      System.out.print("Enter forth side:  ");
      d = s.nextDouble();
      if(a==b)
      { if(b==c)
              if(c==d)
                   System.out.print("It is squre  ");
        
        }
        }
    
}
