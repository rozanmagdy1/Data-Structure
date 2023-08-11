public class Stack {
    int[] stack;
    int size;
    int top;

    Stack(int s){
        size = s;
        top = -1;
        stack = new int[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            System.exit(1);
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return stack[top];
    }

    public void viewStack() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }
}
