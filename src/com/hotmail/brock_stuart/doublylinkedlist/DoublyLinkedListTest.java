package com.hotmail.brock_stuart.doublylinkedlist;

import java.util.Scanner;

public class DoublyLinkedListTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Creating object of class linkedList */
        DoublyLinkedList list = new DoublyLinkedList(); 
        System.out.println("Doubly Linked List Test\n");          
        //char ch;
        boolean done = false;
        /*  Perform list operations  */
        do {
            System.out.println("\nDoubly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");
            System.out.println("7. exit");
            int choice = scan.nextInt();            
            switch (choice) {
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.prepend( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to insert");
                list.append( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt() ;
                System.out.println("Enter position");
                int pos = scan.nextInt() ;
                list.insertAtPos(num, pos);
                break;                                          
            case 4 : 
                System.out.println("Enter position");
                int p = scan.nextInt() ;
                list.deleteAtPos(p);
                break;
            case 5 : 
                System.out.println("Empty status = "+ list.isEmpty());
                break;                   
            case 6 : 
                System.out.println("Size = "+ list.getSize() +" \n");
                break;
            case 7 :
                done = true;
                break;
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            list.display();
            /*
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
            */                        
        } while (!done);
        scan.close();
    }

}
