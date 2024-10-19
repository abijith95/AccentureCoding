package UncommonNumber;

import java.util.ArrayList;
import java.util.Scanner;

//You are given with two list with their size. You have to find the count of elements that are not common in both lists.
//
//        Input:
//
//        11
//
//        1 1 2 3 4 5 5 7 6 9 10
//
//        10
//
//        11 12 13 4 5 6 7 18 19 20
//
//        Output :
//
//        12
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }

        int n2 = sc.nextInt();

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < n2; i++) {
            list2.add(sc.nextInt());
        }

        System.out.println(UncommonNum(list1,list2));
    }

    public static int UncommonNum(ArrayList<Integer> list1,ArrayList<Integer> list2)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {

            boolean check = true;
            for(int j=0;j< list2.size();j++)
            {
               if(list1.get(i) == list2.get(j))
               {
                   check = false;
               }
            }

            if(check)
            {
                ans.add(list1.get(i));
            }
        }

        for (int i = 0; i < list2.size(); i++) {

            boolean check = true;
            for(int j=0;j< list1.size();j++)
            {
                if(list2.get(i) == list1.get(j))
                {
                    check = false;
                }
            }

            if(check)
            {
                ans.add(list2.get(i));
            }
        }

        return ans.size();

    }
}
