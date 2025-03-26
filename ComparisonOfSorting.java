// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class ComparisonOfSorting {
    
public static long bubbleSort(int[] arr){
    long startTime = System.nanoTime();
    int size = arr.length;
    boolean swapped; // to checked swapping is happening or not
    
    for(int i = 0; i< size-1; i++){
      swapped = false;
      for(int j = 0; j< size-1; j++){
          if(arr[j] > arr[j+1]){ // comparison of integers
              int tem = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = tem;
              swapped = true;
          }
      }
      if(!swapped) break;
    }
    
    long endTime = System.nanoTime();
    return endTime - startTime;
}

public static void merging(int[] arr, int start,int end, int mid){
    int len1 = mid - start + 1;
    int len2 = end - mid;
    
    int[] first = new int[len1];
    int[] second = new int[len2];
    
    // add elements of first half of array in new array
    int mainArrayIndex = start;
    for(int i = 0; i<len1; i++){
        first[i] = arr[mainArrayIndex++];
    }
    
    // add elements of second half of array in new array
    mainArrayIndex = mid + 1;
    for(int i = 0; i<len2;i++){
        second[i] = arr[mainArrayIndex++];
    }
    
    // comparing the elements of both arrays
    mainArrayIndex = start;
    int index1 = 0;
    int index2 = 0;
    while(index1 < len1 && index2 < len2){
        if(first[index1] < second[index2]){
            arr[mainArrayIndex++] = first[index1++];
        }
        else{
            arr[mainArrayIndex++] = second[index2++];
        }
    }
    
    // fill the remaining element into main array
    while(index1 < len1){
        arr[mainArrayIndex++] = first[index1++];
    }
    
    while(index2 < len2){
        arr[mainArrayIndex++] = second[index2++];
    }
}

public static void merge(int[] arr, int start,int end){
    if(start >= end) return ;
    
    int mid = (end - start)/2 + start;  // finding mid of array
    merge(arr, start, mid); // dividing the array upto its mid
    merge(arr, mid+1, end);
    
    merging(arr,start,end,mid); // merge both array divided upto theirs mid
}

public static long mergeSort(int[] arr){
    long startTime = System.nanoTime();
    
    merge(arr,0,arr.length-1);
    
    long endTime = System.nanoTime();
    return endTime - startTime;
}

public static int quicking(int[] arr, int start, int end){
    int pivot = arr[start];
    int i = start;
    int j = end;
    
    while(i < j){
        while(arr[i] <= pivot && i <= end - 1){
            i++;
        }
        
        while(arr[j] >= pivot && j >= start + 1){
            j--;
        }
        
        if(i < j){
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
        }
    }
    
    int tem = arr[start];
    arr[start] = arr[j];
    arr[j] = tem;
    return j;
}

public static void quick(int[] arr, int start, int end){
    if(end > start){
        
        int pIndex = quicking(arr,start,end);
        
        quick(arr, start, pIndex-1);
        quick(arr, pIndex+1,end);
    }
}

public static long quickSort(int[] arr){
    long startTime = System.nanoTime();
    
    quick(arr,0, arr.length-1);
    
    long endTime = System.nanoTime();
    return endTime - startTime;
}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // first the size of array is 1000
        int[] arr = new int[1000];
        for(int i = 0;i < 1000;i++){
            arr[i] = (int)(Math.random() * 1000);
        }
    
        int[] firstBubbleArray = Arrays.copyOf(arr,arr.length);
        int[] firstMergeArray = Arrays.copyOf(arr,arr.length);
        int[] firstQuickArray = Arrays.copyOf(arr,arr.length);
        
        long firstBubbleTime = bubbleSort(firstBubbleArray);
        long firstMergeTime = mergeSort(firstMergeArray);
        long firstQuickTime = quickSort(firstQuickArray);
        
        System.out.println("Time taken by bubble sort for 1000 inputs is " + firstBubbleTime);
        System.out.println("Time taken by merge sort for 1000 inputs is " + firstMergeTime);
        System.out.println("Time taken by quick sort for 1000 inputs is " + firstQuickTime);
        
        // Same code for 10000 inputs
        int[] arr1 = new int[10000];
        for(int i = 0;i < 10000;i++){
            arr1[i] = (int)(Math.random() * 1000);
        }
        
        int[] secondBubbleArray = Arrays.copyOf(arr1,arr1.length);
        int[] secondMergeArray = Arrays.copyOf(arr1,arr1.length);
        int[] secondQuickArray = Arrays.copyOf(arr1,arr1.length);
        
        long secondBubbleTime = bubbleSort(secondBubbleArray);
        long secondMergeTime = mergeSort(secondMergeArray);
        long secondQuickTime = quickSort(secondQuickArray);
        
          System.out.println("\nTime taken by bubble sort for 10000 inputs is " + secondBubbleTime);
        System.out.println("Time taken by merge sort for 10000 inputs is " + secondMergeTime);
        System.out.println("Time taken by quick sort for 10000 inputs is " + secondQuickTime);
        
        
        // same code for 1000000 inputs
        int[] arr2 = new int[1000000];
        for(int i = 0;i < 1000000;i++){
            arr2[i] = (int)(Math.random() * 1000);
        }
        
        int[] thirdBubbleArray = Arrays.copyOf(arr2,arr2.length);
        int[] thirdMergeArray = Arrays.copyOf(arr2,arr2.length);
        int[] thirdQuickArray = Arrays.copyOf(arr2,arr2.length);
        
        // long thirdBubbleTime = bubbleSort(thirdBubbleArray);
        long thirdMergeTime = mergeSort(thirdMergeArray);
        long thirdQuickTime = quickSort(thirdQuickArray);
        
        // System.out.println("\nTime taken by bubble sort for 1000000 inputs is " + thirdBubbleTime);
        System.out.println("\nTime taken by merge sort for 1000000 inputs is " + thirdMergeTime);
        System.out.println("Time taken by quick sort for 1000000 inputs is " + thirdQuickTime);
        
        System.out.println("\nThe result is ");
        System.out.println("For 1000000 inputs, bubble sort is unfeasible");
        System.out.println("Quick sort is faster than merge sort and bubble sort.");
    }
}


// Output:
// Time taken by bubble sort for 1000 inputs is 6995310
// Time taken by merge sort for 1000 inputs is 697180
// Time taken by quick sort for 1000 inputs is 400950

// Time taken by bubble sort for 10000 inputs is 319066955
// Time taken by merge sort for 10000 inputs is 25322808
// Time taken by quick sort for 10000 inputs is 1289560

// Time taken by merge sort for 1000000 inputs is 308057396
// Time taken by quick sort for 1000000 inputs is 890205810

// The result is 
// For 1000000 inputs, bubble sort is unfeasible
// Quick sort is faster than merge sort and bubble sort.
