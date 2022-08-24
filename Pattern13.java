// write a program to Print a palindromic number pyramid.
//              1
//            2 1 2
//          3 2 1 2 3
//        4 3 2 1 2 3 4
//      5 4 3 2 1 2 3 4 5

import java.util.*;

public class Pattern13
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
                    System.out.print("  ");
                }
                //numbers
                for(int j=i; j>=1 ; j--) 
                {
                    System.out.print(j+" ");
                }
                for(int j=2; j<=i ; j++) 
                {
                    System.out.print(j+" ");
                }
                System.out.println();           
        }
    }
}