// write a program to make a linked list and add the following elements to it : (1,5,7,3,8,2,3) search for the number 7 and display its index.

import java.util.LinkedList;
import java.util.Scanner;

class SeacrhLinkedList
{
    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of value you want to add in the linked list : ");
        int n = Sc.nextInt();
        System.out.println();

        for( int i=0 ; i<n ; i++ )
        {
            System.out.print("Enter the value : ");
            int val = Sc.nextInt();
            list.addLast(val);
            System.out.println();
        }
        System.out.println();

        System.out.print("Enter the value you want to search : ");
        int SearchVal = Sc.nextInt();
        System.out.println();
        
        int idx=-1;
        for ( int i=0 ; i<list.size() ; i++ )
        {
            if( SearchVal==list.get(i))
            idx=i;
        }

        if( idx==-1 )
        System.out.println("The search element is not found in the linked list.");
        else 
        System.out.println("The search element is found in inedx "+idx);
    
        }
    }
