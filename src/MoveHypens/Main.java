package MoveHypens;

import java.util.Scanner;

//        The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). Implement the function to move all hyphens(-) in the string to the front of the given string.
//
//        NOTE:- Return null if str is null.
//
//        Example :-
//
//        Input:
//        str.Move-Hyphens-to-Front
//        Output:
//        —MoveHyphenstoFront
//        Explanation:-
//
//        The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”
//
//        Sample Input
//
//        Str: String-Compare
//        Sample Output-
//
//        -StringCompare
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
