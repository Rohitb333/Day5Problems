package com.javapackage.FunctionProblem;

import java.util.Scanner;

public class SumOf3IntegerAdd2Zero {

    static void sum0count(int n) {
        int[] arr = new int[n];
        int count = 0;
        System.out.println("enter values");
        // taking integer input for creating array
        for (int i = 0; i < n; i++) {
            Scanner s = new Scanner(System.in);
            arr[i] = s.nextInt();
        }
        // checking for triplets by loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        count++;
                        System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
                    }
                }
            }
        }
        System.out.println("total pairs are " + count);

    }

    public static void main(String[] args) {

        System.out.println("enter no of inputs");
        Scanner s = new Scanner(System.in);
        ;
        int n = s.nextInt();
        sum0count(n);

    }
}
