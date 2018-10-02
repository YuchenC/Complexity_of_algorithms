/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuchen
 */
public class testNode 
{
    private Node first;
    private Node last;
    private int N;
    
    private static class Node
    {
        int item;
        Node next;
    }
    
    public static void main (String[] args)
    {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();
        
        first.next = second;
        second.next = third;
        third.next = fourth;
        
        first.item = 7;
        second.item = 6;
        third.item = 5;
      
        
        for (Node x = first; x != null; x = x.next)
        {
            Node tempafter = x.next;
            int temp = 0;
            if (x.item > tempafter.item)
            {
                temp = x.item;
                x.item = tempafter.item;
                tempafter.item = temp;
            }      
        }
        
        for (Node x = first; x != null; x = x.next)
        {
            System.out.print(x.item + " ");
        }
        
        
    }
    
}
