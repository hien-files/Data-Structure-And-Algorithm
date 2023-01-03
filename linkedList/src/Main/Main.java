package Main;

import module.*;

public class Main {
    private static void insertTop(LinkedList ls) {
        for (int i = 1; i <= 5; i++) {
            ls.insertTopOfList(i);
        }

        System.out.println("===== intsert Top =====");
        ls.printList();
    }
    
    private static void insertLast(LinkedList ls) {
        for (int i = 10; i <= 15; i++) {
            ls.insertLastOfList(i);
        }
        
        System.out.println("\n===== intsert last =====");
        ls.printList();
    }

    private static void insertAfterNode(LinkedList ls, int nodeData, int data) {
        Node rs = ls.findNode(nodeData);
        if (rs != null) {
            ls.insertAfterNode(rs, data);
        }

        System.out.println("\n===== intsert "+data+" after node "+nodeData+" =====");
        ls.printList();
    }

    private static void deleteFirts(LinkedList ls) {
        ls.deleteFirstNodeOfList();
        System.out.println("\n===== delete first node of list =====");
        ls.printList();
    }

    private static void deleteLast(LinkedList ls) {
        ls.deleteLastNodetOfList();
        System.out.println("\n===== delete last node of list =====");
        ls.printList();
    }

    private static void deleteAfterNode(LinkedList ls, int dataNode) {
        Node rs = ls.findNode(dataNode);
        if (rs != null) {
            ls.deleteAfterNode(rs);
        }

        System.out.println("\n===== delete after node "+dataNode+" =====");
        ls.printList();
    }

    private static void deleteNodeAtInde(LinkedList ls, int index) {
        ls.deleteNodeAtIndex(index);
        System.out.println("\n===== delete node at index "+index+" =====");
        ls.printList();
    } 

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();

        insertTop(ls);
        insertLast(ls);
        insertAfterNode(ls, 10, 101);
        deleteFirts(ls);
        deleteLast(ls);
        deleteAfterNode(ls, 101);
        deleteNodeAtInde(ls, 4);
    }
}
