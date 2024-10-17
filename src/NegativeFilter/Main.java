package NegativeFilter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(NegativeFilter(arr));
    }

    public static int NegativeFilter(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] >= 0)
            {
                list.add(arr[i]);
            }
        }

       return list.get(list.size()/2 - 1);
    }
}