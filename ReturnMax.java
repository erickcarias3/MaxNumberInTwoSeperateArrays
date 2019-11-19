package com.findDevideAndConquer;

public class ReturnMax {


    /*this function returns the largest element in an array given an array and a starting and end point

        The find max int function uses recursion to devide the array into sub arrays
        the array is devided up into arrays of length less than 3
        once arrays are devided up then the checks return either a compared max value or a single integer
        the math.max then compares the largest of each sub array

     */
    public int findMaxInt(int[] array, int start , int end){
        if(end-start == 1){
            return array[start]>array[end] ? array[start] : array[end];
        }
        else if(start==end){
            return array[start];
        }

        return Math.max( findMaxInt(array, start, (start+end)/2), findMaxInt(array, (start+end)/2 + 1, end));
    }

    //this functions compares two array max numbers and returns largest of the two
    public int compareTwoArrays(int[] array1, int[] array2){

        int largestElement1;
        int largestElement2;

        largestElement1 = findMaxInt(array1,0,array1.length-1);
        largestElement2 = findMaxInt(array2,0,array2.length-1);

        int largestElement = Math.max(largestElement1,largestElement2);



        return largestElement;
    }

}

