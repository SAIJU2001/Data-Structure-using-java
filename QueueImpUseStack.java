// write a program to implement a queue data structure using two stacks and perform the operations

import java.util.Scanner;
import java.util.Stack;

public class QueueImpUseStack
{
    public static class Queue
    {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty()
        {
            return s1.isEmpty();
        }
        public static void add(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }
        public static int remove()
        {
            if(isEmpty())
            {
                return -1;
            }   
                return s1.pop();
        }
        public static int peek()
        {
            if(s1.isEmpty())
                return -1;
            else
                return s1.peek();
        }
        public static void main(String args[])
        {
            Queue q = new Queue();
            Scanner Sc = new Scanner(System.in);
            int pressVal;

            do{
                System.out.print("For exit press 0.\nFor add into the Queue press 1.\nFor Remove from the Queue press 2.\nFor check peek value press 3.\n\nPress here : ");

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
                        q.add(val);
                        System.out.println("The value "+val+" sucessfully Enque.");
                        System.out.println();
                        break;
                    case 2 :
                        int val2=q.remove();
                        System.out.println("The value "+val2+" Dequeue from the Queue.");
                        System.out.println();
                        break;
                    case 3 :
                        System.out.println("The peek value is : "+q.peek());
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
}