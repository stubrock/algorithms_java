package com.hotmail.brock_stuart.binarytree;

public class BinaryTreeNode {
    
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    
    final private int key;
    final private String name;
    
    BinaryTreeNode(int key, String name) {
        this.key = key;
        this.name = name;
        
        left = null;
        right = null;
    }
    
    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public int getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " has a key " + key;
    }

}
