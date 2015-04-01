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
    
    public BinaryTreeNode getReplacementNode(BinaryTreeNode replaceNode) {
        BinaryTreeNode replacementParent = replaceNode;
        BinaryTreeNode replacement = replaceNode;
        
        BinaryTreeNode curNode = replaceNode.getRight();
        
        while (curNode != null) {
            replacementParent = replacement;
            replacement = curNode;
            curNode = curNode.getLeft();
        }
        
        if (replacement != replaceNode.getRight()) {
            replacementParent.setLeft(replacement.getRight());
            replacement.setRight(replaceNode.getRight());
        }
        return replacement;
    }
    
    public boolean remove(int key) {
        BinaryTreeNode curNode = root;
        BinaryTreeNode parent = root;
        
        boolean isALeftChild = true;
        
        while (curNode.getKey() != key) {
            parent = curNode;
            
            if (key < curNode.getKey()) {
                isALeftChild = true;
                curNode = curNode.getLeft();
            } else {
                isALeftChild = false;
                curNode = curNode.getRight();
            }
            
            if (curNode == null)
                return false;
        }
        
        if (curNode.getLeft() == null && curNode.getRight() == null) {
            if (curNode == root) {
                root = null;
            } else if (isALeftChild) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
        } else if (curNode.getRight() == null) {
            if (curNode == root) {
                root = curNode.getRight();
            } else if (isALeftChild) {
                parent.setLeft(curNode.getLeft());
            } else {
                parent.setRight(curNode.getLeft());
            }
        } else if (curNode.getLeft() == null) {
            if (curNode == root) {
                root = curNode.getRight();
            } else if (isALeftChild) {
                parent.setLeft(curNode.getRight());
            } else {
                parent.setRight(curNode.getLeft());
            }
        } else {
            BinaryTreeNode replacement = getReplacementNode(curNode);
            
            if (curNode == root) {
                root = replacement;
            } else if (isALeftChild) {
                parent.setLeft(replacement);
            } else {
                parent.setRight(replacement);
            }
            replacement.setLeft(curNode.getLeft());
        }
        return true;
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
