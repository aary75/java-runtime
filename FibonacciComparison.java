// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class FibonacciComparison {

    // Recursive Fibonacci
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Fibonacci value: 10");
        int firstLimit = 10;

        // Measure time for Recursive
        long firstStartRecursive = System.nanoTime();
        System.out.println("Recursive Result: " + fibonacciRecursive(firstLimit));
        long firstEndRecursive = System.nanoTime();
        System.out.println("Recursive Time: " + (firstEndRecursive - firstStartRecursive) + "ms");

        // Measure time for Iterative
        long firstStartIterative = System.nanoTime();
        System.out.println("Iterative Result: " + fibonacciIterative(firstLimit));
        long firstEndIterative = System.nanoTime();
        System.out.println("Iterative Time: " + (firstEndIterative - firstStartIterative) + "ms");


         System.out.println("\nEnter Fibonacci value: 30");
        int secondLimit = 30;

        // Measure time for Recursive
        long secondStartRecursive = System.nanoTime();
        System.out.println("Recursive Result: " + fibonacciRecursive(secondLimit));
        long secondEndRecursive = System.nanoTime();
        System.out.println("Recursive Time: " + (secondEndRecursive - secondStartRecursive) + "ms");

        // Measure time for Iterative
        long secondStartIterative = System.nanoTime();
        System.out.println("Iterative Result: " + fibonacciIterative(secondLimit));
        long secondEndIterative = System.nanoTime();
        System.out.println("Iterative Time: " + (secondEndIterative - secondStartIterative) + "ms");
        
        
        System.out.println("\nEnter Fibonacci value : 50");
        int thirdLimit = 50;
 
        // Measure time for Recursive
      //  long thirdStartRecursive = System.nanoTime();
       // System.out.println("Recursive Result: " + fibonacciRecursive(thirdLimit));
      //  long thirdEndRecursive = System.nanoTime();
      //  System.out.println("Recursive Time: " + (thirdEndRecursive - thirdStartRecursive) + "ms");

        // Measure time for Iterative
        long thirdStartIterative = System.nanoTime();
        System.out.println("Iterative Result: " + fibonacciIterative(thirdLimit));
        long thirdEndIterative = System.nanoTime();
        System.out.println("Iterative Time: " + (thirdEndIterative - thirdStartIterative) + "ms");
        
        
        System.out.println("\nThe result is: ");
        System.out.println("Recursive function is useful for large values, use iterative");
        scanner.close();
    }
}


// Enter Fibonacci value: 10
// Recursive Result: 55
// Recursive Time: 323980ms
// Iterative Result: 55
// Iterative Time: 122890ms

// Enter Fibonacci value: 30
// Recursive Result: 832040
// Recursive Time: 6742220ms
// Iterative Result: 832040
// Iterative Time: 113660ms

// Enter Fibonacci value : 50
// Iterative Result: -298632863
// Iterative Time: 149490ms

// The result is: 
// Recursive function is useful for large values, use iterative
