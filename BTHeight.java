// write a program to find the height of the binary tree.

import java.util.*;

public class BTHeight
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
    public static int height(Node root)
    {
        if(root==null)
        return 0;
        
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int totalHeight=Math.max(leftHeight,rightHeight)+1;

        return totalHeight;
    }
    public static void main(String args[])
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.builderBinaryTree( nodes);
        int totalHeight=height(root);
        System.out.print("The height of this binary tree : "+totalHeight);
    }
} 