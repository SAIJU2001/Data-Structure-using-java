// binary search using recursion

import java.util.Scanner;

public class BinarySearchRecursion
{
    public static int search( int arr[] , int low , int target , int high )
    {
        if( low<=high )
        {
            int mid=low+(high-low)/2;

            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                return search( arr , low , target , mid-1 );
            else if(arr[mid]<target)
                return search( arr , mid+1 , target , high );
 
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);

        //input the size of the array
        System.out.print("Enter the length of the array : ");
        int len = Sc.nextInt();
        System.out.println();

        //creat an array
        int arr[] = new int[len];

        //input the array elements
        for( int i=0 ; i<len ; i++ )
        {
            System.out.print("Enter the value of the index no "+i+" : "); 
            arr[i]=Sc.nextInt();
        }
        System.out.println();

        //input the target element
        System.out.print("Enter the target element : ");
        int target = Sc.nextInt();

        //call the method for binary search opeartion
        int findIndex = search(arr,0,target,len-1);

        //print the index of the target element
        if( findIndex==-1 )
            System.out.print("The element is not found in this array.");
        else
            System.out.print("The element is found in index no : "+findIndex);
    }
}