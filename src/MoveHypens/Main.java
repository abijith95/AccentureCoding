package MoveHypens;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();

        System.out.println(Movehyphen(s));
    }

    public static String Movehyphen(String s)
    {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s.length();i++) {
            if(s.charAt(i) == '-')
            {
                sb1.append(s.charAt(i));
            }
            else
            {
                sb2.append(s.charAt(i));
            }
        }

        String ans = (sb1.append(sb2)).toString();

        return ans;
    }
}
