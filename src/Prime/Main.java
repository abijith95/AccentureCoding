package Prime;

import java.util.Scanner;

// Prime Or Not

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        if(n < 2)
        {
            System.out.println("False");
        }else
        {
            for(int i=2;i<n;i++)
            {
                if(n%i == 0)
                {
                    System.out.println("False");
                    return;
                }
            }

            System.out.println("True");
        }
    }
}
