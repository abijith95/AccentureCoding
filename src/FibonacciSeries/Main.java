package FibonacciSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        System.out.print(first+" "+second+" ");

        for(int i=2;i<=n;i++)
        {
            int third = first + second;
            System.out.print(third+" ");

            first = second;
            second = third;
        }
    }
}
