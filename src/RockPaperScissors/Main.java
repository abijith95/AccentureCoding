package RockPaperScissors;

import java.util.Scanner;

//Rock, Paper and Scissors
//
//        Two players A and B are playing the game of Rock, Paper and scissors. Player A chooses a move represented by String M and the move can be one of the following:
//
//        Rock, paper or scissors where
//
//        Rock beats scissors
//
//        Scissor beats paper
//
//        Paper beats rock
//
//        Your task is to find and return a string value representing the winning move for B.
//
//        Input 1:
//
//        rock
//
//        Output 1:
//
//        paper

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
