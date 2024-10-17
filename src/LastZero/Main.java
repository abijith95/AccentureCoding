package LastZero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        int j =0 ;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != 0)
            {
                ans[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
