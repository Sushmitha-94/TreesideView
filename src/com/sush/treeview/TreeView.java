package com.sush.treeview;

public class TreeView {

    public static int index=-1;

    public static void main(String srgs[]){
        Node head=new Node(1);
        head.left=new Node(2);
        head.right=new Node(3);

        Node node=head.left;
        node.right=new Node(4);
        node=node.right;
        node.left=new Node(7);
        node.right=new Node(8);
        node.right.right=new Node(9);

        node=head.right;
        node.left=new Node(5);
        node.right=new Node(6);

        leftTreeView(head,0);

        index=-1;

        rightTreeView(head,0);
    }

    private static void rightTreeView(Node node, int i) {
        if(null!=node){
            if(index<i){
                System.out.println(node.value);
                index=i;
            }
            rightTreeView(node.right,i+1);
            rightTreeView(node.left,i+1);
        }
    }

    private static void leftTreeView(Node node, int i) {

        if(null!=node){
            if(index<i){
                System.out.println(node.value);
                index=i;
            }
            leftTreeView(node.left,i+1);
            leftTreeView(node.right,i+1);
        }
    }
}
