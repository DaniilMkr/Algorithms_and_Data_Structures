package com.daniil.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTreeLinkedList binaryTreeLinkedList = new BinaryTreeLinkedList();
        BinaryNode N1 = new BinaryNode();
        N1.values = "N1";
        BinaryNode N2 = new BinaryNode();
        N2.values = "N2";
        BinaryNode N3 = new BinaryNode();
        N3.values = "N3";
        BinaryNode N4 = new BinaryNode();
        N4.values = "N4";
        BinaryNode N5 = new BinaryNode();
        N5.values = "N5";
        BinaryNode N6 = new BinaryNode();
        N6.values = "N6";
        BinaryNode N7 = new BinaryNode();
        N7.values = "N7";
        BinaryNode N8 = new BinaryNode();
        N8.values = "N8";
        BinaryNode N9 = new BinaryNode();
        N9.values = "N9";

        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N3.left = N6;
        N3.right = N7;
        N4.left = N8;
        N4.right = N9;
        binaryTreeLinkedList.root = N1;

        System.out.println("In order traversal");
        binaryTreeLinkedList.inOrder(binaryTreeLinkedList.root);
        System.out.println("\n");

        System.out.println("Pre order traversal");
        binaryTreeLinkedList.preOrder(binaryTreeLinkedList.root);
        System.out.println("\n");

        System.out.println("Post Order traversal");
        binaryTreeLinkedList.postOrder(binaryTreeLinkedList.root);
        System.out.println("\n");

        System.out.println("Level Order traversal");
        binaryTreeLinkedList.levelOrder();
        System.out.println("\n");

        System.out.println("Search");
        binaryTreeLinkedList.search("N5");
        System.out.println("\n");






    }

}
