// write a program to print a number pyramid
//              1
//             2 2
//            3 3 3 
//           4 4 4 4 
//          5 5 5 5 5

import java.util.*;

public class Pattern12
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int row=Sc.nextInt();
        System.out.println();
       
            for(int i=1; i<=row ; i++) 
            {
                //spaces
                for(int j=1; j<=row-i; j++) 
                {
                    System.out.print(" ");
                }
                //numbers
                for(int j=1; j<=i; j++) 
                {
                    System.out.print(i+" ");
                }
                System.out.println();           
        }
    }
}