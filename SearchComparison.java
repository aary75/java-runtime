// Creating the SearchComparison to comparison in array, hashSet, TreeSet searching technique

import java.util.*;

public class SearchComparison {

    // Array search method (O(N))
    private static boolean arraySearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    // HashSet search method (O(1))
    private static boolean hashSetSearch(HashSet<Integer> set, int target) {
        return set.contains(target);
    }

    // TreeSet search method (O(log N))
    private static boolean treeSetSearch(TreeSet<Integer> tree, int target) {
        return tree.contains(target);
    }

    public static void main(String[] args) {
        int size = 1_000_001;  // Change size for testing
        int firstTarget = 1000;
        int secondTarget = 10000;
        int thirdTarget = 1000000;

        // Populate data structures
        int[] array = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Benchmark Array search
        System.out.println("\nNumber of inputs is: " + firstTarget);
        long firstStartArray = System.nanoTime();
        System.out.println("Array contains target: " + arraySearch(array, firstTarget));
        long firstEndArray = System.nanoTime();
        System.out.println("Array Search Time: " + (firstEndArray - firstStartArray) / 1_000_000.0 + " ms");

        // Benchmark HashSet search
        long firstStartHashSet = System.nanoTime();
        System.out.println("\nHashSet contains target: " + hashSetSearch(hashSet, firstTarget));
        long firstEndHashSet = System.nanoTime();
        System.out.println("HashSet Search Time: " + (firstEndHashSet - firstStartHashSet) / 1_000_000.0 + " ms");

        // Benchmark TreeSet search
        long firstStartTreeSet = System.nanoTime();
        System.out.println("\nTreeSet contains target: " + treeSetSearch(treeSet, firstTarget));
        long firstEndTreeSet = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (firstEndTreeSet - firstStartTreeSet) / 1_000_000.0 + " ms");
        
        
        
        // for secondTarget
        System.out.println("\nNumber of inputs is: "+ secondTarget);
         // Benchmark Array search
        long secondStartArray = System.nanoTime();
        System.out.println("Array contains target: " + arraySearch(array, secondTarget));
        long secondEndArray = System.nanoTime();
        System.out.println("Array Search Time: " + (secondEndArray - secondStartArray) / 1_000_000.0 + " ms");

        // Benchmark HashSet search
        long secondStartHashSet = System.nanoTime();
        System.out.println("\nHashSet contains target: " + hashSetSearch(hashSet, secondTarget));
        long secondEndHashSet = System.nanoTime();
        System.out.println("HashSet Search Time: " + (secondEndHashSet - secondStartHashSet) / 1_000_000.0 + " ms");

        // Benchmark TreeSet search
        long secondStartTreeSet = System.nanoTime();
        System.out.println("\nTreeSet contains target: " + treeSetSearch(treeSet, secondTarget));
        long secondEndTreeSet = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (secondEndTreeSet - secondStartTreeSet) / 1_000_000.0 + " ms");
        
        
        // for third target
        System.out.println("\nNumber of inputs is: " + thirdTarget);
         // Benchmark Array search
        long thirdStartArray = System.nanoTime();
        System.out.println("Array contains target: " + arraySearch(array, thirdTarget));
        long thirdEndArray = System.nanoTime();
        System.out.println("Array Search Time: " + (thirdEndArray - thirdStartArray) / 1_000_000.0 + " ms");

        // Benchmark HashSet search
        long thirdStartHashSet = System.nanoTime();
        System.out.println("\nHashSet contains target: " + hashSetSearch(hashSet, thirdTarget));
        long thirdEndHashSet = System.nanoTime();
        System.out.println("HashSet Search Time: " + (thirdEndHashSet - thirdStartHashSet) / 1_000_000.0 + " ms");

        // Benchmark TreeSet search
        long thirdStartTreeSet = System.nanoTime();
        System.out.println("\nTreeSet contains target: " + treeSetSearch(treeSet, thirdTarget));
        long thirdEndTreeSet = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (thirdEndTreeSet - thirdStartTreeSet) / 1_000_000.0 + " ms");
    }
}



// Output
// Number of inputs is: 1000
// Array contains target: true
// Array Search Time: 0.40399 ms

// HashSet contains target: true
// HashSet Search Time: 0.160739 ms

// TreeSet contains target: true
// TreeSet Search Time: 0.22532 ms

// Number of inputs is: 10000
// Array contains target: true
// Array Search Time: 0.43304 ms

// HashSet contains target: true
// HashSet Search Time: 0.14244 ms

// TreeSet contains target: true
// TreeSet Search Time: 0.16285 ms

// Number of inputs is: 1000000
// Array contains target: true
// Array Search Time: 4.576249 ms

// HashSet contains target: true
// HashSet Search Time: 0.11776 ms

// TreeSet contains target: true
// TreeSet Search Time: 0.128009 ms
