package ReplaceString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int i = 0;
        int j = s.length()-1;

        char[] arr = s.toCharArray();
        while(i < j)
        {
            if((arr[i] >= 97 && arr[i] <= 122) || (arr[i] >= 65 && arr[i] <= 90))
            {
                if((arr[j] >= 97 && arr[j] <= 122) || (arr[j] >= 65 && arr[j] <= 90)) {
                    if(arr[i] == ' ' || arr[j] == ' ')
                    {
                        i++;
                        j--;
                        continue;
                    }
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    i++;
                    j--;
                }
                else {
                    j--;
                }
            }
            else
            {
                i++;
            }
        }

        System.out.println(String.copyValueOf(arr));



    }
}
