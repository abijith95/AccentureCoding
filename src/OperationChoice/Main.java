package OperationChoice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(OperationChoice(c,a,b));
    }

    public static int OperationChoice(int c,int a,int b)
    {
        int ans = 0;
        switch (c)
        {

            case 1 :
               ans =  a+b;
                break;
            case 2 :
                ans =  Math.abs(a-b);
                break;
            case 3 :
                ans =  a*b;
                break;
            case 4 :
                ans =  a/b;
                break;
        }
        return ans;
    }
}
