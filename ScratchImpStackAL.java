// write a program to implement stack using Array List (scratch implement).

import java.util.*;

public class ScratchImpStackAL
{
    static class Stack
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        public boolean isEmpty()
        {
            return list.size()==0;
        }

        public void push(int data)
        {
            list.add(data);
        }

        public int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=list.get(list.size()-1);
            return top;
        }
    }
    
    public static void main(String args[])
    {
        Stack s = new Stack();
        int val;
        Scanner Sc = new Scanner(System.in);
        do
        {
            System.out.print("For Exit press 0.\nFor push operation press 1.\nFor pop operation press 2.\nFor check peek press 3.\n\npress here : ");
            val = Sc.nextInt();
            switch(val)
            {
                case 0 :
                    System.out.println("Program Terminated !!");
                    break;
                case 1 :
                    System.out.print("Enter the value : ");
                    int data = Sc.nextInt();
                    s.push(data);
                    System.out.println("The value is sucessfull push into the stack.\n");
                    break;
                case 2 :
                    System.out.println("The value "+s.pop()+" is sucessfully pop from the stack.\n");
                    break;
                case 3 :
                    System.out.println("The peek value is : "+s.peek()+".\n");
                    break;
                default : 
                    System.out.println("Invalid number.");
                    break;
            }
        }while(val!=0);
    }
}


