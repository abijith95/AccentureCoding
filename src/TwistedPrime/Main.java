package TwistedPrime;

import java.util.Scanner;

//70 ---- 17 ===> Prime
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int alt = 0;
        while (n != 0)
        {
            int rem = n%10;

            alt = (alt * 10) + rem;

            n = n/10;
        }



            boolean check  = true;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if(n%i == 0)
                {
                    check = false;
                    break;
                }
            }

            for (int i = 2; i < Math.sqrt(alt); i++) {
                if(alt%i == 0)
                {
                    check = false;
                    break;
                }
            }

            if(check)
            {
                System.out.println("It is a Twisted Prime ");
            }

            else {
                System.out.println("It is not a Twisted Prime");
            }




    }
}
