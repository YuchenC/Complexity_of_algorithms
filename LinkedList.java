public class LinkedList 
{
     private Node first; 
     private Node last;  
     private int N;      
     private class Node
     {
         int item;
         Node next; 
     }
     public boolean isEmpty() {  return first == null;  }  // Or: N == 0.
     public int size()        {  return N;  }
     public void enqueue(int item)
     { 
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldlast.next = last;
        N++;
}/*
     public int dequeue()
     {  
        int item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
     }*/
     
     public static void sort (LinkedList q)
    {
        Node x;
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
                Node tempafter = x.next;
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
    
    public static void swap(Node x)
    {
        Node tempafter = x.next;
        int temp = 0;
        temp = x.item;
        x.item = tempafter.item;
        tempafter.item = temp;
    }
    
}


