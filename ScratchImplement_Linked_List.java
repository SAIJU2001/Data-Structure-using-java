// write a program to implement linked list
// scratch implementation

import java.util.Scanner;

class ScratchImplement_Linked_List
{
    Node head;
    private int size;

    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    } 

    // add first
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    // add last
    public void addLast(String data)
    {
        size++;
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }

        Node currNode=head;
        while( currNode.next != null )
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    // print
    public void printList()
    {
        if(head==null)
        {
            System.out.println("The linked list is empty.");
        }
        Node currNode=head;
        while( currNode != null )
        {
            System.out.print(currNode.data+" => ");
            currNode=currNode.next;
        }
        System.out.println("null"); 
    }

    // delete first
    public void removeFirst()
    {
        if(head==null)
        {
            System.out.println("The linked list is empty.");
        }

        size--;
        head=head.next;
    }

    // delete last
    public void removeLast()
    {
        if(head==null)
        {
            System.out.println("The linked list is empty.");
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }

        Node currNode=head;
        Node nextNode=head.next;
        while( nextNode.next != null )
        {
            nextNode=nextNode.next;
            currNode=currNode.next;
        }
        currNode.next=null; 
    }

    // to get the size
    public void  getSize()
    {
        System.out.println("The size of the linked list : "+this.size);
        System.out.println();
    }

    public static void main(String args[])
    {
        ScratchImplement_Linked_List list = new ScratchImplement_Linked_List();

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
                    list.printList();
                    break;
                case 4 :
                    list.getSize();
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