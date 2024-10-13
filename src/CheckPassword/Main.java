package CheckPassword;

import java.util.Scanner;

//You are given a function.
//        int CheckPassword(char str[], int n);
//        The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
//        str is a valid password if it satisfies the below conditions.
//
//        – At least 4 characters
//        – At least one numeric digit
//        – At Least one Capital Letter
//        – Must not have space or slash (/)
//        – Starting character must not be a number
//        Assumption:
//        Input string will not be empty.
//
//        Example:
//
//        Input 1:
//        aA1_67
//        Input 2:
//        a987 abC012
//
//        Output 1:
//        1
//        Output 2:
//        0
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int min = sc.nextInt();
        int num = 0, cap = 0, small = 0;
       if(s.length() > min)
       {
           if(s.charAt(0) >= '0' && s.charAt(0) <= '9' )
           {
               System.out.println("0");
               return;
           }
           for (int i = 0; i < s.length(); i++) {
              if(s.charAt(i) == ' ' || s.charAt(i) == '/')
              {
                  System.out.println("0");
                  return;
              }  if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                  cap++;
              }
               if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                   small++;
               }
               if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                   num++;
               }
           }

           if(num > 0 && cap > 0 && small > 0)
           {
               System.out.println("1");
               return;
           }
           else {
               System.out.println("0");
           }
       }
       else
       {
           System.out.println("-1");
       }
    }
}
