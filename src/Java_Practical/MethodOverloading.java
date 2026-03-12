package Java_Practical;

public class MethodOverloading {

    // Overloaded methods
    static void sum(int a, int b) {
        System.out.println( a + b);
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        sum(10, 20);  // calls first method
        int result = sum(5, 10, 15); // calls second method
        System.out.println(result);
    }
}
