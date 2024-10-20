package VoiceAravinth;

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

        int num = sc.nextInt();

        int ans = Voicearavinth(num);

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = arr[i] * ans;
        }

        System.out.println(Arrays.toString(arr));


    }

    public static int Voicearavinth(int num)
    {
        int count = 0;
        int inc = 1;
        boolean flag = true;
        while (count < num)
        {
            inc = inc + 1;

            for (int i = 2; i < inc; i++) {
                if(inc%i == 0)
                {
                 flag = false;
                 break;
                }
            }

            if(flag)
            {
                count = count + 1;
            }
            else
            {
                flag = true;
            }
        }

        return inc;
    }
}
