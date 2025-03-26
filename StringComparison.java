// Creating the StringComparison class to compare string, stringbuilder, stringbuffer

import java.util.*;
public class StringComparison {

// Appending in string
public static long addString(String str,String target, int limit){
    long startTime = System.nanoTime();
    for(int i=0; i<limit; i++){
        str += target;
    }
    
    long endTime = System.nanoTime();
    return endTime - startTime;
}


// Appending in stringBuilder
public static long addBuilder(StringBuilder str,String target, int limit){
    long startTime = System.nanoTime();
    for(int i=0; i<limit; i++){
        str.append(target);
    }
    
    long endTime = System.nanoTime();
    return endTime - startTime;
}

    
// Appending in stringBuffer
public static long addBuffer(StringBuffer str,String target, int limit){
    long startTime = System.nanoTime();
    for(int i=0; i<limit; i++){
        str.append(target);
    }
    
    long endTime = System.nanoTime();
    return endTime - startTime;
}


public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner class to add user's input
        
        // Enter the string to be append
        String target = "Hello";
    
        String firstString = "";
        StringBuilder firstBuilder = new StringBuilder("");
        StringBuffer firstBuffer = new StringBuffer("");
        
        int firstLimit = 1000;  // first limit
        long firstStringTime = addString(firstString,target,firstLimit);
        long firstBuilderTime = addBuilder(firstBuilder,target,firstLimit);
        long firstBufferTime = addBuffer(firstBuffer,target,firstLimit);
        
        System.out.println("\nTime taken by string to add 1000 inputs is " + firstStringTime);
        System.out.println("Time taken by stringbuilder to add 1000 inputs is " + firstBuilderTime);
        System.out.println("Time taken by stringbuffer to add 1000 inputs is " + firstBufferTime);
        
        
        // same code for 10000 inputs
        String secondString = "";
        StringBuilder secondBuilder = new StringBuilder("");
        StringBuffer secondBuffer = new StringBuffer("");
        
        int secondLimit = 10000;  // second limit
        long secondStringTime = addString(secondString,target,secondLimit);
        long secondBuilderTime = addBuilder(secondBuilder,target,secondLimit);
        long secondBufferTime = addBuffer(secondBuffer,target,secondLimit);
        
        System.out.println("\nTime taken by string to add 10000 inputs is " + secondStringTime);
        System.out.println("Time taken by stringbuilder to add 10000 inputs is " + secondBuilderTime);
        System.out.println("Time taken by stringbuffer to add 10000 inputs is " + secondBufferTime);
        
        
        
        // same code for 1000000 inputs
        String thirdString = "";
        StringBuilder thirdBuilder = new StringBuilder("");
        StringBuffer thirdBuffer = new StringBuffer("");
        
        int thirdLimit = 1000000;  //third limit
     
    //    long thirdStringTime = addString(thirdString,target,thirdLimit);
        long thirdBuilderTime = addBuilder(thirdBuilder,target,thirdLimit);
        long thirdBufferTime = addBuffer(thirdBuffer,target,thirdLimit);
        

     //   System.out.println("\nTime taken by string to add 1000000 inputs is " + thirdStringTime);
        System.out.println("\nTime taken by stringbuilder to add 1000000 inputs is " + thirdBuilderTime);
        System.out.println("Time taken by stringbuffer to add 1000000 inputs is " + thirdBufferTime);
        
        
        System.out.println("\nThe result is ");
        System.out.println("For 1000000 inputs, string is unusable");
        System.out.println("StringBuilder is faster than string and stringbuffer.");
    }
}


// Output
// Time taken by string to add 1000 inputs is 2971410
// Time taken by stringbuilder to add 1000 inputs is 283650
// Time taken by stringbuffer to add 1000 inputs is 310520

// Time taken by string to add 10000 inputs is 22878260
// Time taken by stringbuilder to add 10000 inputs is 730530
// Time taken by stringbuffer to add 10000 inputs is 515270

// Time taken by stringbuilder to add 1000000 inputs is 71307309
// Time taken by stringbuffer to add 1000000 inputs is 21941869

// The result is 
// For 1000000 inputs, string is unusable
// StringBuilder is faster than string and stringbuffer.
