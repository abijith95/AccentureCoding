package StockPrice;

import java.util.Scanner;

//You are working on a financial analyzing tool which represents the daily
// stock prices of a company over a time. Each element in integer array A of size N represents the closing
// price of the dock for a particular day. Your task is to find and return an integer vive representing the total
// number of days where the stock price decreased, indicating negative growth

//Input Specification:
//
//        input1: An integer array A containing the closing price of the stock.
//
//
//        input2: An e size of array integer value N representing the s
//
//        Output Specification: 20
//
//        Return an integer value representing the total number of days where the stock price decreased, indicating negative growth
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(StockPrice(arr));
    }

    public static int StockPrice(int[] arr)
    {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1])
            {
                count++;
            }
        }

        return count;
    }
}
