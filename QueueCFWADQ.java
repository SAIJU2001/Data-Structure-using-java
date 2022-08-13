// write a program to implement an Queue data structure using collection framework.(Array List implementation)

import java.util.*;

public class QueueCFWADQ
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        Queue<Integer> Q = new ArrayDeque<>();
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
                    Q.add(val);
                    System.out.println("The value "+val+" sucessfully Enque.");
                    System.out.println();
                    break;
                case 2 :
                    System.out.println("The value "+Q.remove()+" Dequeue from the Queue.");
                    System.out.println();
                    break;
                case 3 :
                    System.out.print("The peek value is : "+Q.peek());
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