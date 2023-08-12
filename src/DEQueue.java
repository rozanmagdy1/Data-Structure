public class DEQueue {
    int size;
    int[] q;
    int rear;
    int front;

    public DEQueue(int s) {
        size = s;
        q = new int[size];
        front = -1;
        rear = -1;
    }

    public Boolean isFull() {
        return ((front == 0 && rear == size - 1) || rear == front - 1);
    }

    public Boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public void insertFront(int value) {
        if (isFull()) {
            System.out.println("queue is full");
            System.exit(1);
        } else {
            if (front == -1) {
                rear = front = 0;
            } else if (front == 0)
                front = size - 1;
            else
                front--;
            q[front] = value;
        }
    }

    public void insertRear(int value) {
        if (isFull()) {
            System.out.println("queue is full");
            System.exit(1);
        } else {
            if (rear == -1){
                rear = front = 0;
            }
            else if (rear == size - 1)
                rear = 0;
            else
                rear++;
            q[rear] = value;
        }
    }

    public int deleteFront() {
        int element = 0;
        if (isEmpty()) {
            System.out.println("queue is empty");
            System.exit(1);
        } else {
            element = q[front];
            if (front == rear) {
                rear = front = -1;
            } else if (front == size -1)
                front = 0;
            else
                front++;
        }
        return element;
    }

    public int deleteRear() {
        int element = 0;
        if (isEmpty()) {
            System.out.println("queue is empty");
            System.exit(1);
        } else {
            element = q[rear];
            if (front == rear) {
                rear = front = -1;
            } else if (rear == 0)
                rear = size - 1;
            else
                rear--;
        }
        return element;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            System.exit(1);
        }
        return q[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            System.exit(1);
        }
        return q[rear];
    }


}
