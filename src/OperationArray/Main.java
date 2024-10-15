package OperationArray;

import java.util.Scanner;

//Write a function that has a arr, an integer named 'c' as it's arguments. The function should return an integer that makes certain operation according to the integer for the first and last element of the array.
//
//
//        If c == 1 // a+b
//        If c == 2 // a-b
//        If c == 3// a*b
//        If c == 4// a/b
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int c = sc.nextInt();

        System.out.println(OperationArray(arr,c));
    }

    public static int OperationArray(int[] arr,int c)
    {
        int ans = 0;
        switch (c)
        {
            case 1 :
                ans = arr[0] + arr[arr.length - 1];
                break;
            case 2 :
                ans = arr[0] - arr[arr.length - 1];
                break;
            case 3 :
                ans = arr[0] * arr[arr.length - 1];
                break;
            case 4 :
                ans = arr[0] / arr[arr.length - 1];
                break;
        }

        return ans;
    }
}
