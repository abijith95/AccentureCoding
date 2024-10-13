package EvenOddMatrix;

import java.util.Arrays;
import java.util.Scanner;

//You are required to input the size of the matrix then the elements of matrix, then you have to divide the main matrix in two sub matrices (even and odd)
//        in such a way that element at 0 index will be considered as even and element at 1st index will be considered as odd and so on.
//        Then you have sort the even and odd matrices in ascending order then print the sum of second largest number from both the matrices.
//        Example:
//        enter the size of array : 5
//        enter element at 0 index : 3
//        enter element at 1 index : 4
//        enter element at 2 index : 1
//        enter element at 3 index : 7
//        enter element at 4 index : 9
//        Sorted even array : 1 3 9
//        Sorted odd array : 4 7
//        7
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(SortArray(arr));

    }

    public static int SortArray(int[] arr)
    {
        int[] even = new int[arr.length];
        int[] odd = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0)
            {
                even[j] = arr[i];
                j++;
            }
            else {
                odd[j] = arr[i];
                j++;
            }
        }

        Arrays.sort(odd);
        Arrays.sort(even);

        return odd[odd.length - 2] + even[even.length - 2];
    }
}
