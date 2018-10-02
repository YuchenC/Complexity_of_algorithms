import java.util.Scanner;
//import BubbleSort.*;

public class Driver 
{
    public static void main (String[] args)
    {
        
        for (Sort x = Sort first; x != null; x = x.next)
        {
            System.out.print(x.item + " ");
        }
        //System.out.println("\nlength of linked list is " + counter);    
        System.out.println("\ncounterForInversion = " + counterForInversion);
        System.out.println("counterSwap = " + counterSwap);
               
    }
    
    
    
}
