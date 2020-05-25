package com;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {100,90,80,70,60,50,40,30,20,10};
        int numberToSearch = 10;
        Integer numberIndex = null;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == numberToSearch){
                numberIndex=i;
                break;
            }
        }
        if(numberIndex != null ){
            System.out.println(" The number "+numberToSearch+" found at "+(numberIndex+1) + "th position in provided array.");
        } else {
            System.out.println(" The number "+numberToSearch+" is not present in provided array.");
        }

    }
}
