package Java_Practical;

public class Overload_main_ {

    public static void main(String[] args) {

        System.out.println("Main method started");
        //Creating array as per overloaded main function req.

        int[] data1 = {1, 2, 3, 45, 68, 74};

        float[] data2 = {1.2f, 2.5f, 3.7f};

        // Step 2: Call overloaded main methods
        main(data2);   // calling overloaded main (float[])
        main(data1);   // calling overloaded main (int[])
    }

    // Overloaded main method 1
    public static void main(int[] arr) {
        System.out.println("\nOverloaded main 1 method called");

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    // Overloaded main method 2
    public static void main(float[] arr2) {
        System.out.println("\nOverloaded main 2 method called");

        for (float i : arr2) {
            System.out.print(i+" ");
        }
    }
}
