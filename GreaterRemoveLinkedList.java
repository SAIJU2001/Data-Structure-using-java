// write a program to Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

import java.util.LinkedList;
import java.util.Scanner;

class GreaterRemoveLinkedList
{
    public static void greaterRemove(LinkedList<Integer> list)
    {
        if( list.isEmpty() )
        {
            System.out.println("The list is empty");
            return;
        }
        
        for( int i=0 ; i<list.size() ; i++ )
        {
            if( list.get(i)>25 )
            {
                list.remove(list.get(i));
                i--;
            }
        }
    }
    public static void print(LinkedList<Integer> list)
    {
        for( int i=0 ; i<list.size() ; i++ )
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();  
    } 
    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of length of the linked list : ");
        int n = Sc.nextInt();
        System.out.println();

        for( int i=0 ; i<n ; i++ )
        {
            System.out.print("Enter the value : ");
            int val = Sc.nextInt();
            list.add(val);
            System.out.println();
        }
        System.out.println();

        System.out.print("Before the operation the value of linked list : ");
        print( list );

        greaterRemove(list);

        System.out.print("After the operation the value of linked list : ");
        print( list );
        
        System.out.println();

    }
    
} 
