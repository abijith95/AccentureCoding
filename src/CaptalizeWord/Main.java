package CaptalizeWord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);

        System.out.println(Captalize(s,ch));
    }
    
    public static String Captalize(String s,char ch)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ch)
            {
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
