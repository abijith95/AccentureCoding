package OperationChoice;

import java.util.Scanner;

//Int OperationChoices(int c, int n, int a , int b )
//
//        The function accepts 3 positive integers ‘a’ , ‘b’ and ‘c ‘ as its arguments. Implement the function to return.
//
//        ( a+ b ) , if c=1
//        ( a – b ) , if c=2
//        ( a * b ) ,  if c=3
//        (a / b) ,  if c =4
//        Assumption : All operations will result in integer output.
//
//        Example:
//
//        Input
//        c :1
//        a:12
//        b:16
//        Output:
//        Since ‘c’=1 , (12+16) is performed which is equal to 28 , hence 28 is returned.
//        Sample Input
//
//        c : 2
//
//        a : 16
//
//        b : 20
//
//        Sample Output
//
//        -4
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
