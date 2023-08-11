public class CircularQueue {
    int size;
    int[] q;
    int rear;
    int front;

    public CircularQueue(int s) {
        size = s;
        q = new int[size];
        rear = front = -1;
    }

    public Boolean isFull() {
        return ((front == 0 && rear == size - 1) || rear == front - 1);
    }

    public Boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("queue is full");
            System.exit(1);
        } else {
            if (front == -1)
                front++;
            rear = (rear + 1) % size;
            q[rear] = value;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            System.exit(1);
        }
        int element = q[front];
        if (rear == front)
            front = rear = -1;
        else
            front = (front + 1) % size;
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            System.exit(1);
        }
        return q[front];
    }

    public void viewQueue() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            for (int i = front; i != rear; i = (i + 1) % size) {
                System.out.println(q[i]);
            }
            System.out.println(q[rear]);
        }
    }
}
