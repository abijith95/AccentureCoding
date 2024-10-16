package MakeItSingleDigit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ans = 0;
        while(N/10 != 0)
        {
             if (N%2 == 0) {
                ans = (int)Math.floor((N-2)/2);
            }
            else
            {
                ans = (int)Math.floor(N/2);
            }

            N = ans;
        }

        System.out.println(N);

    }
}
