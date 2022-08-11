// write a program to implement stack using Linked List (scratch implement).

import java.util.*;

public class ScratchImpStackLL
{
    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    public static class Stack
    {
        public Node head;

        public boolean isEmpty()
        {
           return head==null;
        }

        public void push(int data)
        {
            Node newNode = new Node(data);
            if(isEmpty())
            {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public int pop()
        {
            if(isEmpty())
                return -1;

            int top=head.data;
            head=head.next;
            return top;
        }

        public int peek()
        {
            if(isEmpty())
            return -1;

            return head.data;
        }
    }

    public static void main(String args[])
    {
        Stack s = new Stack();
        Scanner Sc = new Scanner(System.in);
        int pressVal;

        do{
            System.out.print("For exit press 0.\nFor push operation press 1.\nFor pop operation press 2.\nFor check peek value press 3.\n\nPress here : ");
            pressVal=Sc.nextInt();
            switch(pressVal)
            {
                case 0 :
                    System.out.print("Program Terminated !!");
                    break;
                case 1 :
                    System.out.print("Enter the value : ");
                    int val=Sc.nextInt();
                    System.out.println();
                    s.push(val);
                    System.out.println("The value "+val+" sucessfully push into the stack.");
                    System.out.println();
                    break;
                case 2 :
                    System.out.println("The value "+s.pop()+" pop from the stack.");
                    System.out.println();
                    break;
                case 3 :
                    System.out.print("The peek value is : "+s.peek());
                    System.out.println();
                    break;
                default :
                    System.out.println("Invalid Number !!");
                    System.out.println();
                    break;
            }

        }while(pressVal!=0);
    }
}
    
