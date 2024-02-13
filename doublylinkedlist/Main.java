package datastructures.doublylinkedlist;

public class Main {
    public static void main(String args[]) {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);

        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();

        System.out.println("\nDoubly Linked List:");
        myDoublyLinkedList.printList();
    }
}
