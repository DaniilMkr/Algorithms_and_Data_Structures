package com.daniil.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLinkedList {
    BinaryNode root;

    public BinaryTreeLinkedList() {
        this.root = null;
    }

    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.values + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.values + " ");
        inOrder(node.right);
    }

    void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.values + " ");
    }


    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.values + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.values == value) {
                System.out.println("The value" + value + " is found in Tree");
                return;
            } else {
                if (presentNode.left!=null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right!=null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value" + value + " is not found in Tree");
    }

    public void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.values = value;
        if (root == null) {
            root = newNode;
            System.out.println("Inserted new node at root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Successfully inserted");
                break;
            }
            if (presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("Successfully inserted");
                break;
            }
            else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    // Get Deepest node
    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null) {
                previousNode.right = null;
                return;
            } else if (presentNode.right == null) {
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    // Delete Given note

    public void deleteNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.values == value) {
                presentNode.values = getDeepestNode().values;
                deleteDeepestNode();
                System.out.println("The note is deleted");
                return;
            }
            else {
                if (presentNode.left != null) queue.add(presentNode.left);
                if (presentNode.right != null) queue.add(presentNode.right);
            }
        }
        System.out.println("The note does not exist in the tree");
    }

    public void deleteBT() {
        root = null;
        System.out.println("BT has been successfully deleted");
    }
}
