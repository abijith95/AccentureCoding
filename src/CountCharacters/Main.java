package CountCharacters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(CountCharacters(s));
    }

    public static String CountCharacters(String s)
    {
        StringBuilder sb = new StringBuilder();
        int count =0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                count++;
            }
            else {
                count++;
                sb.append(s.charAt(i));
                sb.append(count);
                count = 0;
            }
        }
        sb.append(s.charAt(s.length()-1));
        sb.append(count+1);


        return sb.toString();
    }
}
