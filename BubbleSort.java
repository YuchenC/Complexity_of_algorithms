

//import java.util.Arrays;
//import java.util.Scanner;
//import LinkledList.*;

public class BubbleSort 
{
    /*public static void main (String[] args)
    {
        int[] a = {1,2,3,4,5,6,6,7,8,9};
        sort(a);
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]);
        }
        
    }*/
    /*
    public static void sort (int[] a)
    {
        //int n = a.length;
        int r = a.length - 2;
        boolean swapped = true;
        while(r >= 0 && swapped)
        {
            swapped = false;
            for (int i = 0; i < r; i++)
            {
                if (a[i] > a[i + 1])
                {
                    swapped = true;
                    swap(a, i ,i + 1);
                }
            }
        }  
    }
    
    public static void swap (int[] a, int i, int j)
    {
        int temp = 0;
        j = i + 1;
        a[i] = temp;
        a[j] = a[i];
        a[j] = temp;   
    }  */
    public static void sort (LinkedList q)
    {
        Sort x;
        // length of linked list
        int counter = 1;
        for (x = first; x.next != null; x = x.next)
            counter++;
        
        boolean swapped = true;
       
        int r = counter - 2;
        
        while (r >= 0 && swapped)
        {
            swapped = false;
            
            for (x = first; x.next != null; x = x.next)
            {
                Sort tempafter = x.next;
                int temp = 0;
                if (x.item > tempafter.item)
                {
                    swapped = true;
                    swap(x);
                }      
          
            }
            r--;
            
            
        }
        
    }
    
    public static void swap(Sort x)
    {
        Sort tempafter = x.next;
        int temp = 0;
        temp = x.item;
        x.item = tempafter.item;
        tempafter.item = temp;
    }
    
   
}
