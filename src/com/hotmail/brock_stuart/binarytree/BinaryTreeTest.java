package com.hotmail.brock_stuart.binarytree;

public class BinaryTreeTest {

    public static void main(String[] args) {
        
        BinaryTree theTree = new BinaryTree();
        
        theTree.addNode(50, "boss");
        theTree.addNode(25, "vice");
        theTree.addNode(15, "offc");
        theTree.addNode(2,  "intern");
        theTree.addNode(18, "dentry");
        theTree.addNode(30, "sect");
        theTree.addNode(75, "slmn_1");
        theTree.addNode(85, "slmn_2");
        
        System.out.println("inOrderTraversal");
        theTree.inOrderTraversal(theTree.getRoot());

        System.out.println("\npreOrderTraversal");
        theTree.preOrderTraversal(theTree.getRoot());

        System.out.println("\npostOrderTraversal");
        theTree.postOrderTraversal(theTree.getRoot());
        
        System.out.println("\nSearching for 30");
        System.out.println(theTree.findNode(30));
        
        System.out.println("\nRemoving key 25");
        theTree.remove(25);

        System.out.println("\ninOrderTraversal");
        theTree.inOrderTraversal(theTree.getRoot());

    }

}
