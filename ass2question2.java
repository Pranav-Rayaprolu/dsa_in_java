class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    // Insert at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Insert at a specific position in the list
    public void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtBeginning(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            int count = 0;
            while (count < position - 1 && current != null) {
                current = current.next;
                count++;
            }
            if (current == null) {
                System.out.println("Invalid position");
                return;
            }
            newNode.prev = current;
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
        }
    }

    // Delete a node with a specific data value
    public void delete(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    current.prev.next = current.next;
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                }
                if (current == tail) {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Data not found in the list");
    }

    // Print the doubly linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class ass2question2 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtBeginning(0);
        list.insertAtPosition(3, 2);

        System.out.println("Doubly Linked List:");
        list.printList();

        list.delete(2);
        list.delete(0);

        System.out.println("Doubly Linked List after deletion:");
        list.printList();
    }
}
