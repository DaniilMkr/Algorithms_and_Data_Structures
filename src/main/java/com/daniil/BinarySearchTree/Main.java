package com.daniil.BinarySearchTree;

import com.daniil.BinaryTree.BinaryTreeLinkedList;


public class Main {
    public static void main(String[] args) {
        BinaryTreeLinkedList binaryTreeLinkedList = new BinaryTreeLinkedList();


        // Insert value in the tree
        binaryTreeLinkedList.insert("N1");
        binaryTreeLinkedList.insert("N2");
        binaryTreeLinkedList.insert("N3");
        binaryTreeLinkedList.insert("N4");
        binaryTreeLinkedList.levelOrder();
        System.out.println();
//        binaryTreeLinkedList.deleteDeepestNode();
        binaryTreeLinkedList.deleteNode("N4");
        System.out.println();
        binaryTreeLinkedList.levelOrder();

        binaryTreeLinkedList.deleteBT();

    }

}
