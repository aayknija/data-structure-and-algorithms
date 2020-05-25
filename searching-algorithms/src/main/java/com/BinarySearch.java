package com;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {100,90,80,70,60,50,40,30,20,10};
        int numberToSearch = -200;
        Integer numberIndex = null;
        // Sorted array is required for binary search
        Arrays.sort(numbers);
        int startIndex=0;
        int lastIndex=numbers.length;
        int middleIndex=Math.floorDiv((startIndex+lastIndex),2);
        if(numberToSearch > numbers[startIndex] && numberToSearch < numbers[lastIndex-1]){
            while ( startIndex <= lastIndex) {
                if(numbers[middleIndex] == numberToSearch){
                    numberIndex=middleIndex;
                    break;
                } else if(numbers[middleIndex] < numberToSearch){
                    startIndex = middleIndex + 1;
                    middleIndex = Math.floorDiv((startIndex+lastIndex),2);
                } else if(numbers[middleIndex] > numberToSearch){
                    lastIndex=middleIndex - 1;
                    middleIndex = Math.floorDiv((startIndex+lastIndex),2);
                }
            }
        }
        if(numberIndex != null ){
            System.out.println(" The number "+numberToSearch+" found at "+(numberIndex+1) + "th position in provided array.");
        } else {
            System.out.println(" The number "+numberToSearch+" is not present in provided array.");
        }

    }
}
