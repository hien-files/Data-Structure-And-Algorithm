package Main;

import module.*;

public class Main {
    private static void insertTop(DoblyLinkedList ls) {
        for (int i = 1; i <= 5; i++) {
            ls.insertTopOfList(i);
        }

        System.out.println("===== intsert Top =====");
        ls.printList();
    }
    
    private static void insertLast(DoblyLinkedList ls) {
        for (int i = 10; i <= 15; i++) {
            ls.insertLastOfList(i);
        }
        
        System.out.println("\n===== intsert last =====");
        ls.printList();
    }

    private static void insertAfterNode(DoblyLinkedList ls, int nodeData, int data) {
        Node rs = ls.findNode(nodeData);
        if (rs != null) {
            ls.insertAfterNode(rs, data);
        }

        System.out.println("\n===== intsert "+data+" after node "+nodeData+" =====");
        ls.printList();
    }

    private static void deleteFirts(DoblyLinkedList ls) {
        ls.deleteFirstNodeOfList();
        System.out.println("\n===== delete first node of list =====");
        ls.printList();
    }

    private static void deleteLast(DoblyLinkedList ls) {
        ls.deleteLastNodetOfList();
        System.out.println("\n===== delete last node of list =====");
        ls.printList();
    }

    private static void deleteAfterNode(DoblyLinkedList ls, int dataNode) {
        Node rs = ls.findNode(dataNode);
        if (rs != null) {
            ls.deleteAfterNode(rs);
        }

        System.out.println("\n===== delete after node "+dataNode+" =====");
        ls.printList();
    }

    private static void deleteNodeAtInde(DoblyLinkedList ls, int index) {
        ls.deleteNodeAtIndex(index);
        System.out.println("\n===== delete node at index "+index+" =====");
        ls.printList();
    } 

    private static void printListReverse(DoblyLinkedList ls) {
        System.out.println("\n===== Print list reverse =====");
        ls.printListReverse();
    }

    public static void main(String[] args) {
        DoblyLinkedList ls = new DoblyLinkedList();

        insertTop(ls);
        printListReverse(ls);
        insertLast(ls);
        insertAfterNode(ls, 10, 101);
        deleteFirts(ls);
        deleteLast(ls);
        deleteAfterNode(ls, 101);
        deleteNodeAtInde(ls, 1);
    }
}
