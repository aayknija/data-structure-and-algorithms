package com;

import java.util.Arrays;

public class MergeSort {

    public void sort(int[] data) {
        mergeSort(data, 0, data.length-1);
    }

    public void mergeSort(int[] numbers, int startIndex, int endIndex){
        if(startIndex < endIndex){
            int middleIndex = Math.floorDiv((startIndex+endIndex),2);
            mergeSort(numbers,startIndex,middleIndex);
            mergeSort(numbers,middleIndex+1,endIndex);
            merge(numbers,startIndex,middleIndex,endIndex);
        }
    }

    private void merge(int[] numbers, int startIndex, int middleIndex, int endIndex) {
        int sizeOfLeftArray=middleIndex-startIndex+1;
        int sizeOfRightArray=endIndex-middleIndex;
        int[] leftArray = new int[sizeOfLeftArray];
        int[] rightArray = new int[sizeOfRightArray];
        // copying data to left array
        for(int i=0;i<sizeOfLeftArray;i++){
            leftArray[i]=numbers[startIndex+i];
        }
        // copying data to right array
        for(int i=0;i<sizeOfRightArray;i++){
            rightArray[i]=numbers[middleIndex+1+i];
        }
        int i=0,j=0;
        for(int k=startIndex;k<= endIndex;k++){
            if ((j >= sizeOfRightArray) || (i < sizeOfLeftArray && leftArray[i] <= rightArray[j])) {
                numbers[k] = leftArray[i];
                i++;
            } else {
                numbers[k]=rightArray[j];
                j++;
            }
        }

    }

    public static void main(String[] args) {
        MergeSort sorter = new MergeSort();
        int[] data = {100,90,80,70,60,50,40,30,20,10};
        sorter.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
