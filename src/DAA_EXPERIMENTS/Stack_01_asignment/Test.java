package DAA_EXPERIMENTS;

class Stack {
    int[] stack;
    int top, size;

    Stack(int s){ size=s; stack=new int[size]; top=-1; }

    void push(int x){ stack[++top]=x; }

    int pop(){ return stack[top--]; }
}

class CharStack {
    char[] stack;
    int top, size;

    CharStack(int s){ size=s; stack=new char[size]; top=-1; }

    void push(char x){ stack[++top]=x; }

    char pop(){ return stack[top--]; }
}

public class Test {
    public static void main(String[] args) {

        Stack s=new Stack(3);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Pop from stack: "+s.pop());

        CharStack cs=new CharStack(3);
        cs.push('A');
        cs.push('B');
        cs.push('Z');
        System.out.println("Pop from char stack: "+cs.pop());

        System.out.println("TEST SUCCESSFUL");
    }
}
