package SwitchtoturnOn;

import java.util.Scanner;


// {0,1,0,1}  ===> {1,0,1,0}
//                 {1,1,0,1}
//                 {1,1,1,0}
//                 {1,1,1,1}          ====> 4
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
               arr[i] = sc.nextInt();
        }

        System.out.println(Switchturn(arr));
    }


    public static int Switchturn(int[] arr)
    {
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 0)
            {
                arr[i] = 1;
                for(int j= i+1;j<arr.length;j++) {
                    if (arr[j] == 0)
                        arr[j] = 1;
                    else
                        arr[i] = 0
                                ;
                }
            }

            count++;
        }

        return count;
    }
}
