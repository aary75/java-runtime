//Creating the SearchTarget using linear and binary search in large dataset

import java.util.*;

class SearchTarget {

// Searching by linear search
public static long linearSearch(int[] arr, int target){
    long startTime = System.nanoTime();  // starting time for linear search
    int size = arr.length;
    int val = 0;
    
    for(int i = 0;i<size-1; i++){
        if(arr[i] == target){
            val = i;
            break;
        }
    }
    long endTime = System.nanoTime(); // ending time for linear search
    return endTime - startTime;
}

// Searching by binary search
public static long binarySearch(int[] arr, int start, int end, int target){
 
     long startTime = System.nanoTime(); // starting time for binary search
     int val = 0;
     while(start < end){
         int mid = start + (end - start)/2;
         if(arr[mid] == target){
             val = mid;
             break;
         }
         else if(arr[mid] < target) start = mid + 1;
         else end = mid - 1;
     }
     long endTime = System.nanoTime(); // ending time for binary search
     return endTime - startTime;
}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner class to get user's input
        
        // first the size of array is 1000
        int[] arr = new int[1000];
        for(int i = 0;i < 1000;i++){
            arr[i] = (int)(Math.random() * 1000);
        }
        int firstTarget = arr[999];
        Arrays.sort(arr); // sorting the array
    
        long firstTimeLinear = linearSearch(arr,firstTarget);
    
        long firstTimeBinary = binarySearch(arr,0, 999, firstTarget);
        
        
        System.out.println("Time taken by linear search for 1000 inputs is " + firstTimeLinear);
        System.out.println("Time taken by binary search for 1000 inputs is " + firstTimeBinary);
        
        
        // Same code for 10000 inputs
        int[] arr1 = new int[10000];
        for(int i = 0;i < 10000;i++){
            arr1[i] = (int)(Math.random() * 1000);
        }
        int secondTarget = arr1[9999];
        Arrays.sort(arr1);
        
        long secondTimeLinear = linearSearch(arr1,secondTarget);
        
        long secondTimeBinary = binarySearch(arr1,0, 9999, secondTarget);
        
        System.out.println("\nTime taken by linear search for 10000 inputs is " + secondTimeLinear);
        System.out.println("Time taken by binary search for 10000 inputs is " + secondTimeBinary);
        
        
        // same code for 1000000 inputs
        int[] arr2 = new int[1000000];
        for(int i = 0;i < 1000000;i++){
            arr2[i] = (int)(Math.random() * 1000);
        }
        int thirdTarget = arr2[99999];
        Arrays.sort(arr2);
        
        long thirdTimeLinear = linearSearch(arr2,thirdTarget);

        long thirdTimeBinary = binarySearch(arr2,0, 99999, thirdTarget);
        
        System.out.println("\nTime taken by linear search for 100000 inputs is " + thirdTimeLinear);
        System.out.println("Time taken by binary search for 100000 inputs is " + thirdTimeBinary);
        
        System.out.println("\nThe result is ");
        System.out.println("If we first sorted the data then go for both linear searching and binary searching, in this case binary searching in better than linear searching but in other case linear searching in better");
    }
}


// Output
// Time taken by linear search for 1000 inputs is 10920
// Time taken by binary search for 1000 inputs is 1410

// Time taken by linear search for 10000 inputs is 133350
// Time taken by binary search for 10000 inputs is 1140

// Time taken by linear search for 100000 inputs is 2213120
// Time taken by binary search for 100000 inputs is 790

// The result is 
// If we first sorted the data then go for both linear searching and binary searching, in this case binary searching in better than linear searching but in other case linear searching in better



