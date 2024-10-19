package NumberOfString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int k = sc.nextInt();

        System.out.println(NumberOfString(s,k));
    }

    public static String NumberOfString(String s,int k)
    {
        String[] arr = s.split("\\s+");

//        System.out.println(Arrays.toString(arr));
        StringBuilder sb = new StringBuilder(30);

        for (int i=0;i< k ;i++)
        {
            sb.append(arr[i]);

            if(i < k)
            {
                sb.append(" ");
            }
        }


        return sb.toString();
    }

}
