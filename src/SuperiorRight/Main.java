package SuperiorRight;

import java.util.Scanner;

//In an array, a superior element is one which is greater than all the elements to its right sic The rightmost element itself be a superior element.
//
//        You are given a function, int Find_Number_Of_Superior_Element(int arr[], int n);
//
//        The function accepts an integer array and the size of array, Implement the function to find the total number of superior elements present in array.
//
//        Assumptions:
//
//        N>0 and Array index starts from 0
//
//        Input: n= 6
//
//        arr= [8,10,6,2,9,7]
//
//        Output: 3
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(SuperiorRight(arr));
    }

    public static int SuperiorRight(int[] arr)
    {
        int count = 0;
        boolean islarge = true;
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1)
            {
                count++;
                break;
            }
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j])
                {
                    islarge = false;
                    break;
                }
            }

            if(islarge)
            {
               count++;
//               islarge = true;
            }
            else
            {
                islarge = true;
            }

        }

        return count;
    }

}
