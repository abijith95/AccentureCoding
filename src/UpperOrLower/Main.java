package UpperOrLower;

import java.util.Scanner;

//
//Given a string you are requested to determine whether the string should be converted to all uppercase
// or all lowercase depending on the count of uppercase and lowercase letter in that string.
//
//        Example 1:
//        AbCdEfG
//
//        Output 1:
//        ABCDEFG
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(UpperOrLower(s));
    }

    public static String UpperOrLower(String s)
    {
        int Uppercount = 0;
        int Lowercount = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)))
            {
                Uppercount++;
            }
            else
            {
                Lowercount++;
            }
        }

        if(Uppercount > Lowercount)
        {
            s = s.toUpperCase();
        }
        else
        {
            s = s.toLowerCase();
        }

        return s;
    }

}
