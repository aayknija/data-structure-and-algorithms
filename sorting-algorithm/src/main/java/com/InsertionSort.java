package com;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {100,90,80,70,60,50,40,30,20,10};
        for(int i=1;i<numbers.length;i++){
            int key = numbers[i];
            int j = i - 1;
            while(j >= 0 && numbers[j] > key){
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
        for (int number : numbers) {
            System.out.print(number+",");
        }
        System.out.println("");
    }
}
