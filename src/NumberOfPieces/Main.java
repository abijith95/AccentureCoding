package NumberOfPieces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = (n*(n+1))/2 + 1;

        System.out.println(ans%1000000007);


    }
}
