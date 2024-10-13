package Calculate;

import java.util.Scanner;

//You are required to implement the following function:
//        Int Calculate(int m, int n);
//        The function accepts 2 positive integers ‘m’ and ‘n’ as its arguments.You are required to calculate the sum of numbers divisible both by 3 and 5, between ‘m’ and ‘n’ both inclusive and return the same.
//
//        Note:
//        0 < m <= n
//
//        Example
//        Input:
//        m : 12
//        n : 50
//
//        Output
//        90

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int ansum = 0;

        for(int i = m;i<= n;i++)
        {
            if((i%3==0) && (i%5==0))
            {
                ansum += i;
            }
        }
        System.out.println(ansum);


    }
}
