package datastructures.doublylinkedlist;

public class Main {
    public static void main(String args[]) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);
        
        //Insert
        // System.out.println("DLL before insert():");
        // myDLL.printList();

        // myDLL.insert(1, 2);

        // System.out.println("\nDLL after insert(2) in middle:");
        // myDLL.printList();

        // myDLL.insert(0, 0);

        // System.out.println("\nDLL after insert(0) at beginning:");
        // myDLL.printList();

        // myDLL.insert(4, 4);

        // System.out.println("\nDLL after insert(4) at end:");
        
        //Remove
        System.out.println("DLL before remove():");
        myDLL.printList();
        
        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(2).value);
        System.out.println("DLL after remove() in middle:");
        myDLL.printList();
        
        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(0).value);
        System.out.println("DLL after remove() of first node:");
        myDLL.printList();
        
        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(2).value);
        System.out.println("DLL after remove() of last node:");
        
        myDLL.printList();
    }
}
