package DAA_EXPERIMENTS;
// This file is created to test user-defined classes from another file without import (same package)
public class Test {
    public static void main(String[] args) {

        // Testing Stack class
        Stack s = new Stack(3);
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Pop from stack: " + s.pop()); // 30

        // Testing CharStack class
        CharStack cs = new CharStack(3);
        cs.push('A');
        cs.push('B');
        cs.push('Z');

        System.out.println("Pop from char stack: " + cs.pop()); // C

        System.out.println("TEST SUCCESSFUL ");
    }
}
