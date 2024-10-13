package ReplaceCharacter;

import java.util.Scanner;
//You are given a function,
//        void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);
//
//        The function accepts a string ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its argument.
//        Implement the function to modify and return the string ‘ str’ in such a way that all occurrences of ‘ch1’ in the original string are replaced by ‘ch2’ and all occurrences of ‘ch2’ in the original string are replaced by ‘ch1’.
//
//        Assumption: String Contains only lower-case alphabetical letters.
//
//        Note:
//        Return null if the string is null.
//        If both characters are not present in the string or both of them are the same , then return the string unchanged.
//
//        Example:
//        Input:
//        Str: apples
//        ch1:a
//        ch2:p
//
//        Output:
//        paales
//        Explanation:
//        ‘A’ in the original string is replaced with ‘p’ and ‘p’ in the original string is replaced with ‘a’, thus output is paales.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);

        System.out.println(ReplaceCharacter(arr,ch1,ch2));
    }

    public static String ReplaceCharacter(char[] arr,char ch1,char ch2)
    {
        StringBuilder sb = new StringBuilder(30);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == ch1)
            {
                sb.append(ch2);
            }
            else if(arr[i] == ch2)
            {
                sb.append(ch1);
            }
            else
            {
                sb.append(arr[i]);
            }


        }
        return sb.toString();
    }
}
