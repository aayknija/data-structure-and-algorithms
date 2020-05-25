package com;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {100,90,80,70,60,50,40,30,20,10};

        for(int i=0;i<numbers.length;i++){
            int minIndex=i;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i] > numbers[j]){
                    minIndex=j;
                }
                int temp= numbers[i];
                numbers[i]=numbers[minIndex];
                numbers[minIndex]=temp;
            }
        }
        for (int number : numbers) {
            System.out.print(number+",");
        }

    }
}
