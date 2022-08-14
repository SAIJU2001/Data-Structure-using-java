// write a program to implement level order traversal in a binary tree.

import java.util.*;

public class BTLevelOrderTraversal
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
    public static void levelorder(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        
        if(root==null)
        return;

        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node currNode=q.remove();
            if(currNode==null)
            {
                System.out.println();

                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }
            else
            {
                System.out.print(currNode.data+" ");

                if(currNode.left!=null)
                q.add(currNode.left);

                if(currNode.right!=null)
                q.add(currNode.right);
            }
        }
    }
    public static void main(String args[])
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.builderBinaryTree( nodes);
        levelorder(root);
    }
}