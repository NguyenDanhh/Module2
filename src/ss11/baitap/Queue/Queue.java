package ss11.baitap.Queue;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
            rear.link = front;
        } else {
            rear.link = newNode;
            rear = newNode;
            rear.link = front;
        }
    }

    public void deQueue() {
        int data = front.data;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.link;
            rear.link = front;
        }
    }

    public void displayQueue() {
        Node current = front;
        if (front == null) {
            System.out.println("Trống");
        } else {
            System.out.println("Phần tử hàng đợi là : ");
            do {
                System.out.print(current.data + " ");
                current = current.link;
            } while (current != front);
            System.out.println();
        }
    }

}
