package specialFiboannaci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int third = 1;
        System.out.print(first+" "+second+" "+third+" ");
        for(int i=3;i<n;i++)
        {
            int fourth = first + second + third;
            System.out.print(fourth+" ");
            first = second;
            second = third;
            third = fourth;

        }
    }
}
