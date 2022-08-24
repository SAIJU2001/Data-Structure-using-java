// write a program to print a solid rhombus
//              * * * * *
//            * * * * *
//          * * * * *
//        * * * * *
//      * * * * *

import java.util.*;

public class Pattern11
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int row=Sc.nextInt();
        System.out.println();

        for( int i=1 ; i<=row ; i++ )
        {
            for( int j=1 ; j<=row-i ; j++ )
            {   
                System.out.print("  ");
            }
            for( int j=1 ; j<=row ; j++ )
            {
                System.out.print(" *");
            }
            for( int j=1 ; j<=i-1 ; j++ )
            {
                System.out.print("  ");
            }
            System.out.println();            
        }
    }
}