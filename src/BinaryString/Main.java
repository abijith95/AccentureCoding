package BinaryString;

// The Binary number system only uses two digits, 0 and 1 and the number system can be called binary string. You are required to implement the following function:
// int OperationsBinaryString(char* str);
// The function accepts a string str as its argument. The string str consists of binary digits separated with an alphabet as follows:
// – A denotes AND operation
// – B denotes OR operation
// – C denotes XOR Operation

// You are required to calculate the result of the string str, scanning the string to right taking one operation at a time, and return the same.

// Note: No order of priorities of operations is required.
// Length of str is odd.
// If str is NULL or None (in case of Python), return -1.

// Input:
// 1C0C1C1A0B1

// Output:
// 1

import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(ResultNumber(str));

    }

    public static int ResultNumber(String str)
    {
        int res = str.charAt(0) - '0';
        int i = 1;

        while(i<str.length())
        {
            char ch = str.charAt(i);
            i++;

            if(ch == 'A')
            {
                res = res & (str.charAt(i)- '0');
            }
            else if(ch == 'B')
            {
                res = res | (str.charAt(i) - '0');
            }
            else
            {
                res = res ^ (str.charAt(i) - '0');
            }

            i++;
        }
        return res;
    }



}
