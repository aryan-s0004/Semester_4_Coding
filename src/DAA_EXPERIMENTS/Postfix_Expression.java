package DAA_EXPERIMENTS;
public class Postfix_Expression {
    public static void main(String[] args) {
        String exp = "23*54*+9-";
        int[] stack = new int[20];
        int top = -1;
        for(int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if(c >= '0' && c <= '9') {
                stack[++top] = c - '0';
            } else {
                int b = stack[top--];
                int a = stack[top--];
                if(c == '+') {
                    stack[++top] = a + b;
                } else if(c == '-') {
                    stack[++top] = a - b;
                } else if(c == '*') {
                    stack[++top] = a * b;
                } else if(c == '/') {
                    stack[++top] = a / b;}}}
        System.out.println("Result: " + stack[top]);}}
