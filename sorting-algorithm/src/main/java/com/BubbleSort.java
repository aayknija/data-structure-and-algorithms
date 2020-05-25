package com;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {100,90,80,70,60,50,40,30,20,10};

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length-i-1;j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j]= numbers[j+1];
                    numbers[j+1]= temp;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number+",");
        }

    }
}
