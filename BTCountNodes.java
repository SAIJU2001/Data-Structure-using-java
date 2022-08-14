// write a program to find total no of nodes present in a binary tree.

import java.util.*;

public class BTCountNodes
{
    static class Node
    {   
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BinaryTree
    {
        static int idx=-1;
        public static Node builderBinaryTree( int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=builderBinaryTree( nodes);
            newNode.right=builderBinaryTree( nodes);

            return newNode;
        }
    }
    public static int count(Node root)
    {
        if(root==null)
        return 0;
        
        int leftNodes=count(root.left);
        int rightNodes=count(root.right);

        return leftNodes+rightNodes+1;
    }
    public static void main(String args[])
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.builderBinaryTree( nodes);
        int totalNodes=count(root);
        System.out.print("The total no of nodes in this binary tree : "+totalNodes);
    }
}