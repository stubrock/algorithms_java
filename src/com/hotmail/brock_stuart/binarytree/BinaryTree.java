package com.hotmail.brock_stuart.binarytree;

public class BinaryTree {
    
    BinaryTreeNode root;
    
    public BinaryTree() {
        root = null;
    }
    
    public BinaryTreeNode getRoot(){
        return root;
    }
    
    public void addNode(int key, String name) {
        BinaryTreeNode newNode = new BinaryTreeNode(key, name);
        
        if (root == null) {
            root = newNode;
        } else {
            BinaryTreeNode curNode = root;
            BinaryTreeNode parent;
            
            while (true) {
                parent = curNode;
                if (newNode.getKey() < curNode.getKey()) {
                    curNode = curNode.getLeft();
                    if (curNode == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                } else {
                    curNode = curNode.getRight();
                    if (curNode == null) {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }
    
    public BinaryTreeNode findNode(int key){
        BinaryTreeNode curNode = root;

        while (curNode.getKey() != key) {
            if (key < curNode.getKey()) {
                curNode = curNode.getLeft();
            } else {
                curNode = curNode.getRight();
            }
        
            if (curNode == null) {
                return null;
            }
        }
        
        return curNode;
    }
    
    public void inOrderTraversal(BinaryTreeNode curNode) {
        if (curNode != null) {
            inOrderTraversal(curNode.getLeft());
            System.out.println(curNode);
            inOrderTraversal(curNode.getRight());
        }
    }
    
    public void preOrderTraversal(BinaryTreeNode curNode) {
        if (curNode != null) {
            System.out.println(curNode);
            preOrderTraversal(curNode.getLeft());
            preOrderTraversal(curNode.getRight());
        }
    }
    
    public void postOrderTraversal(BinaryTreeNode curNode) {
        if (curNode != null) {
            postOrderTraversal(curNode.getLeft());
            postOrderTraversal(curNode.getRight());
            System.out.println(curNode);
        }
    }

}
