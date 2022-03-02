package com.company;
import  java.util.*;
import java.lang.reflect.Array;

import  java.util.Collections.*;

public class Main {
    public static int[] fuf (int [] arr, int index){
        int [] arrDestination = new int [arr.length - 1];
        int remainingElements = arr.length - (index + 1);
        System.arraycopy(arr, 0, arrDestination, 0, index);
        System.arraycopy(arr, index + 1, arrDestination, index, remainingElements);
        return arrDestination;
    }
    static void wuw (int [] arr ) {
        for (int g = 0; g < arr.length; g++){
            if (arr[g]%2 == 1) {
                arr = fuf(arr, g);
                g = g - 1;
            }
        }
            for (int i = 0; i < arr.length; i++){

                if (i == arr.length - 1){
                    break;
                }
                if ( arr [i + 1] < arr [i]){
                    int fuf = arr [i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = fuf;
                }


        }
        System.out.println(Arrays.toString(arr));


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("количество элементов");
        int num = in.nextInt();
        int [] arr = new int [num];
        System.out.println("заполним массив");
        for (int i = 0; i < num; i++){
            arr[i] = in.nextInt();
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("элементы массива");
        for (int i : arr){
            System.out.println(i);
        }
        wuw(arr);

    }

    }

