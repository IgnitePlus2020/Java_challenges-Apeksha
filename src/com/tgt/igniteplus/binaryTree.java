package com.tgt.igniteplus;
import java.util.*;
public class binaryTree
{
    public static void main(String[] args)
    {
        Node d=new Node("d");
        Node e =new Node("e");
        Node g =new Node("g");
        Node k =new Node("k");
        Node c =new Node("c", d, null);
        Node h =new Node("h", k, null);
        Node b =new Node("b", c, e);
        Node f =new Node("f", g, h);
        Node root=new Node("a", b, f);
         System.out .println("Leaf nodes of binary tree");
         printLeaves(root);
    }
    private static class Node
    {
        String value;
        Node left;
        Node right;
        Node(String value)
        {
            this.value = value;
        }
        Node(String data,Node left,Node right)
        {
            this.value = data;
            this.left = left;
            this.right = right;
        }
        boolean isLeaf()
        {
            return left==null?right==null:false;
        }
    }
    public static void printLeaves(Node node)
    {
        if(node==null)
        return;
        if(node.isLeaf())
            System.out.printf("%s ", node.value);
        printLeaves(node.left);
        printLeaves(node.right);
    }

}
