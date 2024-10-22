package Grade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] st1 = new int[n];

        for(int i=0;i<st1.length;i++)
        {
            st1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] st2 = new int[m];

        for (int i = 0; i < st2.length; i++) {
             st2[i] = sc.nextInt();
        }


        int s1ans = 0;
        int s2ans = 0;

        for (int i = 0; i < st2.length; i++) {
            s1ans = s1ans + st1[i];
            s2ans = s2ans + st2[i];
        }

        int s1av = s1ans / st1.length;
        int s2av = s2ans / st2.length;

        if(s1av > s2av)
        {
            System.out.println("Student 1");
        }
        else
        {
            System.out.println("Student 2");
        }

    }
}
