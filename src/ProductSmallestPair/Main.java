package ProductSmallestPair;

import java.util.Arrays;
import java.util.Scanner;

//Implement the following Function
//        def ProductSmallestPair(sum, arr)
//        The function accepts an integer sum and an integer array arr of size n.
//        Implement the function to find the pair, (arr[j], arr[k]) where j!=k,such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair.
//
//        Note:
//        Return -1 if array is empty or if n < 2
//        Return 0, if no such pairs found.
//        All computed values lie within integer range.
//
//        Example:
//        Input
//        sum:9
//        Arr:5 2 4 3 9 7 1
//
//        Output
//        2
//
//        Explanation:
//        Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2.


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int n =sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(ProductSmallest(sum,arr));
    }

    public static int ProductSmallest(int sum,int[] arr)
    {
        if(arr == null)
        {
            return -1;
        }
        Arrays.sort(arr);

        int res = arr[0] + arr[1];

        if(res < sum )
        {
            return arr[0] * arr[1];
        }
        else {
            return -1;
        }
    }
}
