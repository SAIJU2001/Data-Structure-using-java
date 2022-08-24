// write a program to Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

import java.util.*;

public class MonthNumber
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the Month number : ");
        int monthNo=Sc.nextInt();
        System.out.println();

        switch(monthNo)
        {
            case 1 :
            System.out.print("The Month is January.");
            break;
            case 2 :
            System.out.print("The Month is February.");
            break;
            case 3 :
            System.out.print("The Month is March.");
            break;
            case 4 :
            System.out.print("The Month is April.");
            break;
            case 5 :
            System.out.print("The Month is May.");
            break;
            case 6 :
            System.out.print("The Month is June.");
            break;
            case 7 :
            System.out.print("The Month is July.");
            break;
            case 8 :
            System.out.print("The Month is August.");
            break;
            case 9 :
            System.out.print("The Month is September.");
            break;
            case 10 :
            System.out.print("The Month is October.");
            break;
            case 11 :
            System.out.print("The Month is November.");
            break;
            case 12 :
            System.out.print("The Month is December.");
            break;
            default :
            System.out.print("Invalid Month Number.");
            break;

        }
    }
}
