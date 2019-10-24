package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,7,6,5,9};
        int[] array2= {2,7,6,3,4};
        for(int i = 0; i < array.length; i++) {
            if(array[i]==array2[i]){
                System.out.print("(" + array[i] + "," + array[i] + ")");
            }
        }
    }
}
