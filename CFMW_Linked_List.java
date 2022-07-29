// write a program to implement linked list
// collection framework implementation

import java.util.Scanner;
import java.util.LinkedList;

class CFMW_Linked_List
{
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();

        int val;
        Scanner Sc = new Scanner(System.in);
        do
        {
            System.out.println("Enter the correct value.\n");
            System.out.println("For Exit press 0.\nAdd first to the linked list press 1.\nAdd last to the linked list press 2.\nprint the linked list press 3.\nCheck the size of  the linked list press 4.\nRemove first element from the linked list press 5.\nRemove last element from the linked list press 6.\n");
            
            val = Sc.nextInt();

            switch(val)
            {
                case 0 :
                    System.out.println("Program Terminated !!");
                    break;
                case 1 :
                    System.out.print("Enter the String : ");
                    String data1 = Sc.next();
                    list.addFirst(data1);
                    System.out.println("The String is sucessfully added to the linked list.\n");
                    break;
                case 2 :
                    System.out.print("Enter the String : ");
                    String data2 = Sc.next();
                    list.addLast(data2);
                    System.out.println("The String is sucessfully added to the linked list.\n");
                    break;
                case 3 :
                    for( int i=0 ; i<list.size() ; i++ )
                    {
                        System.out.print(list.get(i)+" => ");
                    }
                    System.out.print("null\n");

                    break;
                case 4 :
                    System.out.println("The size of the linked list is : "+list.size());
                    break;
                case 5 :
                    list.removeFirst();
                    System.out.println("The String is sucessfully removed from the linked list.\n");
                    break;
                case 6 :
                    list.removeLast();
                    System.out.println("The String is sucessfully removed from the linked list.\n");
                    break;
                default : 
                    System.out.println("Invalid number.");
                    break;
            }
        }while(val!=0);
    }
}