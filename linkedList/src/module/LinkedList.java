package module;

import javax.lang.model.element.Element;

/**
 * LinkedList
 * là một dang cấu trúc dữ liệu tuyến tính,
 * Cấu trúc dữ liệu động,
 * mỗi phần tử đều liên kết với phần tử đúng sau nó,
 * mỗi phần tử là một Node gồm hai thành phần
 * + data: lưu thông tin của phần tử đó
 * + next: lưu phần tử đứng sau, nếu là pt cuối thì next là null
 */

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertTopOfList(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertLastOfList(int data) {
        // nếu rỗng
        if (head == null) {
            insertTopOfList(data);
        } 
        else {
            Node lastNode = head;

            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            Node newNode = new Node(data);
            newNode.next = null;
            lastNode.next = newNode;
        }
    }

    public Node findNode(int data) {
        Node rs = null;
        Node temp = head;

        while (temp != null) {
            if (temp.data == data) {
                rs = temp;
                break;
            }
            temp = temp.next;
        }

        return rs;
    }

    public void insertAfterNode(Node temp, int data) {
        if (temp == null) {
            System.out.println("temp node is null");
        } 
        else {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteFirstNodeOfList() {
        if (head == null) {
            System.out.println("\nLinked lis is empty ...!");
        } 
        else {
            head = head.next;
        }
    }

    public void deleteLastNodetOfList() {
        if (head == null) {
            System.out.println("\nLinked lis is empty ...!");
        } 
        else {
            Node lastNode = head;
            Node beforeLastNode = head;

            while (lastNode.next != null) {
                beforeLastNode = lastNode;
                lastNode = lastNode.next;
            }

            beforeLastNode.next = null;
        }
    }

    public void deleteAfterNode(Node temp) {
        if (head == null) {
            System.out.println("\nLinked lis is empty ...!");
        } 
        else {
            if (temp == null) {
                System.out.println("temp node is null");
            }
            // nếu phần tử tìm thấy là phần tử cuối -> ko xóa pt nào.
            else if (temp.next == null) {
                // pass
            } else {
                temp.next = temp.next.next;
            }
        }
    }

    public Node getNodeAtIndex(int index) {
        if (index < 0) {
            return null;
        } 
        else if (index == 0) {
            return head;
        } 
        else {
            Node temp = head;

            while (index > 0) {
                if (temp.next == null) {
                    break;
                }
                temp = temp.next;
                index--;
            }

            // không lặp hết tức là ko tìm được phần tử thứ index
            if (index == 0) {
                return temp;
            } 
            else {
                return null;
            }
        }
    }

    public void deleteNodeAtIndex (int index) {
        if (index == 0) {
            deleteFirstNodeOfList();
        }
        else if (index < 0) {
            System.out.println("\nIndex can't be less than 0");
        }
        else {
            Node current = getNodeAtIndex(index);
            if (current != null) {
                Node prevNode = getNodeAtIndex(index - 1);
                prevNode.next = current.next;
            } 
            else {
                System.out.println("Not found node");
            }
        }
    }

    public void printList() {
        if (head != null) {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}
