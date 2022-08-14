// write a program to find total sum of nodes present in a binary tree.

import java.util.*;

public class BTSumNodes
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
    public static int sumNodes(Node root)
    {
        if(root==null)
        return 0;
        
        int leftSum=sumNodes(root.left);
        int rightSum=sumNodes(root.right);

        return leftSum+rightSum+root.data;
    }
    public static void main(String args[])
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.builderBinaryTree( nodes);
        int sum=sumNodes(root);
        System.out.print("The sum of nodes in this binary tree : "+sum);
    }
} 