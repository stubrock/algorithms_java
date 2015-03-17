package com.hotmail.brock_stuart.binarytree;

public class BinaryTreeTest {

    public static void main(String[] args) {
        
        BinaryTree theTree = new BinaryTree();
        
        theTree.addNode(50, "boss");
        theTree.addNode(25, "vice");
        theTree.addNode(15, "offc");
        theTree.addNode(30, "sect");
        theTree.addNode(75, "slmn");
        theTree.addNode(85, "slmn 2");
        
        theTree.inOrderTraversal(theTree.getRoot());

        theTree.preOrderTraversal(theTree.getRoot());

        theTree.postOrderTraversal(theTree.getRoot());
        
        System.out.println("\nSearching for 30");
        System.out.println(theTree.findNode(30));

    }

}
