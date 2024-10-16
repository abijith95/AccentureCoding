package RockPaperScissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(rps(s));
    }

    public static String rps(String s)
    {
        if(s.equals("rock"))
        {
            return "paper";
        } else if (s.equals("scissor")) {
            return "rock";
        }
        else
        {
            return "scissors";
        }
    }
}
