
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued " + value + " into the queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return a sentinel value to indicate an error
        } else {
            int dequeuedValue = front.data;
            front = front.next;
            if (front == null) {
                rear = null; // The queue is now empty
            }
            System.out.println("Dequeued " + dequeuedValue + " from the queue");
            return dequeuedValue;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Return a sentinel value to indicate an error
        } else {
            return front.data;
        }
    }
}

public class ass2question4 {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Is queue empty? " + queue.isEmpty());

        queue.dequeue();
        queue.dequeue(); // Trying to dequeue from an empty queue

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
