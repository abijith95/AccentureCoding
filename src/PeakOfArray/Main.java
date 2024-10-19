package PeakOfArray;

import java.util.Scanner;

//input1: (1,2,3,4,3,2,1)
//
//        input2: 7
//
//        Output: 4
//
//        Explanation: Here, in the array (1,2,3,4,3,2,1), we can see that the values are increasing till 4 and then the value starts to decrease, therefore, 4 will the peak. Hence, 4 is returned as the outpu
//
//        Example 2:
//
//        input1: (5,3)
//
//        input2:2
//
//        Output: 5
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int[] arr = new int[input];

        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(PeakOfArray(arr));

    }

    public static int PeakOfArray(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                return arr[i];
            }
        }

        return 0 ;
    }
}
