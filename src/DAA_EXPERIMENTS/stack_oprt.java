package DAA_EXPERIMENTS;
import java.util.Scanner;
public class stack_oprt {
    int[] stack;
    int top;
    int size;
    stack_oprt(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    void push(int x) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            stack[++top] = x;
            System.out.println(x + " pushed");
        }
    }
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println(stack[top--] + " popped");
        }
    }
    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }
    boolean isEmpty() {
        return top == -1;
    }
    boolean isFull() {
        return top == size - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack_oprt s = new stack_oprt(5);
        while (true) {
            System.out.println("\n1.Push  2.Pop  3.Peek  4.isEmpty  5.isFull  6.Exit");
            int ch = sc.nextInt();
            System.out.println("Your choice : " + ch);
            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    s.push(sc.nextInt());
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    System.out.println(s.isEmpty());
                    break;
                case 5:
                    System.out.println(s.isFull());
                    break;
                case 6:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}