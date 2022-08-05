// write a program to implement stack using collection framework.

import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class ImplementStackCFW
{
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();
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
                default :
                    System.out.println("Invalid Number !!");
                    System.out.println();
                    break;
            }

        }while(pressVal!=0);
    }
}