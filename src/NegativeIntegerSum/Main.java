package NegativeIntegerSum;

import java.util.Scanner;


//Imagine you are part of a software development team at a tech company, and your manager has assigned you a task related to financial data analysis. The company's accounting system has just reported four key financial metrics for a project, denoted as abc and d. However, there is a twist: some of these metrics might be negative indicating a loss. Your task is to identify and sum up all the negative metrics.
//
//
//        If there are no negative values, the system should return 0, ensuring no incorrect financial interpretation. Your solution will help the finance team quickly assess any losses that need immediate attention.
//
//
//        Objective: Write a program that takes four integers as input and
//
//        outputs the sum of all negative integers. If there are no negative integers, the output should be 0.
//
//        Example Test Case:
//
//        Input:
//
//        a = - 3
//
//        b = 7
//
//        c = - 1
//
//        * d = 4
//
//        * Output:
//
//        -4
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();


        System.out.println(NegativeSum(a,b,c,d));

    }

    public static int NegativeSum(int a,int b,int c,int d)
    {
        int negsum = 0;

        if(a<0)
        {
            negsum += a;
        }

        if(b<0)
        {
            negsum += b;
        }

        if(c<0)
        {
            negsum += c;
        }

        if(d<0)
        {
            negsum += d;
        }

        return negsum;
    }
}
