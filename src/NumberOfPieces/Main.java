package NumberOfPieces;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        int ans = (n*(n+1))/2 + 1;
//
//        System.out.println(ans%1000000007);
//
//
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        System.out.println(NumberOfpiece(n));
    }

    public static int NumberOfpiece(int n)
    {
        int ans = 1;
        for(int i=1;i<=n;i++)
        {
            ans += i;
        }

        return ans%1000000007;
    }
}
