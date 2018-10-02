/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuchen
 */
public class Sort 
{
    private Sort first; 
    private Sort last;  
    private int N;      
    private static class Node
    {
         int item;
         Node next; 
    }
    
    public static void bubbelsort ()
    {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();
        Node fifth = new Node();
        
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        
        first.item = 4;
        second.item = 5;
        third.item = 1;
        fourth.item = 3;        
        fifth.item = 4;
        
        Node x;
        
        int counter = 1;
        int counterForInversion = 0;
        int counterSwap = 0;
        
        
        for (x = first; x.next != null; x = x.next)
            counter++;
        int r = counter - 2;
        boolean swapped = true;
        while (r >= 0 && swapped)
        {
            swapped = false;
            for (x = first; x.next != null; x = x.next)
            {
                Node tempafter = x.next;
                int temp = 0;
                
                if (x.item > tempafter.item)
                {
                    counterForInversion++;
                    swapped = true;
                    swap(x);
                    counterSwap++;
                }  
            }
            r--;    
        }    
    }
    
    public static void swap(Node x)
    {
        Node tempafter = x.next;
        int temp = 0;
        temp = x.item;
        x.item = tempafter.item;
        tempafter.item = temp;
    }
    
}
