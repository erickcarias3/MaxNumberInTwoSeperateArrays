package com.findDevideAndConquer;

public class Main {

    /*TEST CASE
        This is two sorted arrays used to test the return max class
    */
    public static void main(String[] args) {
        int largestNumber;
        int [] array1 = new int[] {10,20,30,35,45};
        int [] array2 = new int[]{15,30,50,70};
        ReturnMax returnMax = new ReturnMax();

        //largest number between two arrays
        largestNumber = returnMax.compareTwoArrays(array1,array2);

        System.out.println("largest number is: " + largestNumber);
    }
}
