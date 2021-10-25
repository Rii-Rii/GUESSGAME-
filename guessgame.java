import java.util.*;
import java.util.Random;
public class guessgame                            
{               public static void main(String[]args)            
                {                                                         
                Scanner pg = new Scanner(System.i>              
                Random rnd = new Random(); 
                System.out.println("ENTER THE MAX>
                int  range = pg.nextInt();
                int rn = rnd.nextInt(range);
                System.out.println("GUESS THE NUM>
                int i=1;
                while(i<=(range/3))
                {
                int guess = pg.nextInt();
                if(guess==0)
                {
                System.out.println("THANKS FOR PL>
                break;
                }                                                
                else if(guess>rn)                               
               {                                                
                System.out.println("TOO HIGH");                  
               }
                else if(guess==rn)
                {
                System.out.println("!!!You guesse>
                break;
                }                                                
                else
                {                                                 
                System.out.println("TOO LOW");
                }
                i++;
                }
                System.out.println("THE NO. WAS: "+rn);
        }
}
