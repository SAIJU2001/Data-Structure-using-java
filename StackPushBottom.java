// write a program to push at the bottom of the stack.

import java.util.*;

public class StackPushBottom
{
    public static void pushBottom( Stack<Integer> s , int data )
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottom( s , data );
        s.push(top);
    }
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();
        Scanner Sc = new Scanner(System.in);
        int pressVal;

        do{
            System.out.print("For exit press 0.\nFor push operation press 1.\nFor pop operation press 2.\nFor check peek value press 3.\nFor push at bottom operation press 4.\n\nPress here : ");
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
                    System.out.println("The value "+val+" sucessfully pushed into stack.");
                    System.out.println();
                    break;
                case 2 :
                    if(s.isEmpty())
                    {
                        System.out.println("The stack is underflow");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("The value "+s.peek()+" removed from the stack.");
                        s.pop();
                        System.out.println();
                    }
                    break;
                case 3 :
                    if(s.isEmpty())
                        {
                            System.out.println("The stack is underflow");
                            System.out.println();
                        }
                    else
                        {
                            System.out.println("The peek value is : "+s.peek());
                            System.out.println();
                        }
                    break;
                case 4 :
                    System.out.print("Enter the value : ");
                    int data=Sc.nextInt();
                    System.out.println();
                    pushBottom( s , data );
                    break;
                default :
                    System.out.println("Invalid Number !!");
                    System.out.println();
                    break;
            }

        }while(pressVal!=0);
    }
}