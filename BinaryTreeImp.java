//write a program to implement binary tree

import java.util.*;

public class BinaryTreeImp
{
    //create node class which has data part,left child and right child
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)  //node constructor
        {
            this.data=data;
            this.left=null;     //initially set to null
            this.right=null;    //initially set to null
        }
    }

    //create abstract data type which is binary tree basically it builds the tree
    static class BinaryTree
    {
        static int idx=-1;      //just a pointer 

        public static Node buildTree( int nodes[] )     //return type node
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }

            Node newNode = new Node(nodes[idx]);    //current index value put into the new node
            newNode.left = buildTree( nodes);   //for left subtree call the method
            newNode.right = buildTree( nodes);  //for right subtree call the method

            return newNode;
        }
    }
    public static void main(String args[])
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        //declare the abstract class
        BinaryTree tree = new BinaryTree();

        //call the buildtree method to build the tree and node root is stored
        Node root = tree.buildTree( nodes); //return the root nodes
        System.out.println(root.data);
    }
}
