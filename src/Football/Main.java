package Football;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] arr = new String[7];

        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextLine();
        }
        int count = 0;
        int max = 0;
        String ans = " ";
        for(int i=0;i<arr.length - 1;i++)
        {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i].equals(arr[j]))
                {
                    count++;
                }
            }

            if(count > max)
            {
                ans = arr[i];
            }
        }

        System.out.println(ans);
    }
}
