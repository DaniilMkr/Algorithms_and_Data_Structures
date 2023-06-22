package com.daniil.BinarySearchTree;

import com.daniil.BinaryTree.BinaryTreeLinkedList;


public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();


        // Insert value in the tree
        binarySearchTree.insert(100);
        binarySearchTree.insert(20);
        binarySearchTree.insert(30);
        binarySearchTree.insert(15);
        binarySearchTree.levelOrder();
        System.out.println();
//        binaryTreeLinkedList.deleteDeepestNode();

        System.out.println();


    }

}
