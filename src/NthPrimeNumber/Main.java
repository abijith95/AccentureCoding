package NthPrimeNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int inc = 1;

        while(count < n)
        {
            inc = inc  + 1;
            boolean flag = true;
            for(int i=2;i<inc;i++)
            {
                if(inc%i == 0)
                {
                    flag = false;
                    break;
                }
            }

            if(flag == true)
            {
                count = count + 1;
            }
            else {
                flag = true;
            }
        }

        System.out.println(inc);

    }
}
