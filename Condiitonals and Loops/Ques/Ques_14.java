import java.util.*;

public class Ques_14 {
  public static void main(String[] args) {
    //Calculating Batting Avg : 

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of matches played:");
    int n = sc.nextInt();
    int runs = 0;
    int sixes = 0;
    int fours = 0;
    int total_balls = 0;
    double batting_avg;
    for (int i = 0; i < n; i++) {
      System.out.println("Enter the number of runs scored in match " + (i + 1) + ":");
      int runs_scored = sc.nextInt();
      runs += runs_scored;
      total_balls++;
      if (runs_scored >= 60) {
        sixes++;
      }
      if (runs_scored >= 40) {
        fours++;
      }
    }
    double strike_rate = (double) (runs * 100) / total_balls;
    System.out.println("Total runs scored: " + runs);
    System.out.println("Total sixes hit: " + sixes);
    System.out.println("Total fours hit: " + fours);
    System.out.println("Total balls faced: " + total_balls);
    System.out.printf("Strike rate: %.2f\n", strike_rate);
    batting_avg = (double) runs / n;
    System.out.printf("Batting Average: %.2f\n", batting_avg);
    //Calculating Bowling Avg :
    System.out.println("Enter the number of bowls bowled:");
    int bowls = sc.nextInt();
    int wickets = 0;
    int total_overs = 0;
    double bowling_avg;
    for (int i = 0; i < bowls; i++) {
      System.out.println("Enter the number of wickets taken in match " + (i + 1) + ":");
      int wickets_taken = sc.nextInt();
      wickets += wickets_taken;
      total_overs += 5;
    }
    double economy_rate = (double) (runs / total_overs) * 6;
    System.out.println("Total wickets taken: " + wickets);
    System.out.println("Total overs bowled: " + total_overs);
    System.out.printf("Economy rate: %.2f\n", economy_rate);
    bowling_avg = (double) runs / bowls;
    System.out.printf("Bowling Average: %.2f\n", bowling_avg);
    sc.close();
    //Calculating Fielding Avg :
    System.out.println("Enter the number of catches taken:");
    int catches = sc.nextInt();
    System.out.println("Enter the number of stumpings taken:");
    int stumpings = sc.nextInt();
    double fielding_avg = (double) (catches + stumpings) / n;
    System.out.println("Total catches taken: " + catches);
    System.out.println("Total stumpings taken: " + stumpings);
    System.out.printf("Fielding Average: %.2f\n", fielding_avg);
    //Calculating Overall Avg :

    double overall_avg = (batting_avg + bowling_avg + fielding_avg) / 3;
    System.out.printf("Overall Average: %.2f\n", overall_avg);
    //Calculating Highest Score :
    System.out.println("Enter the number of matches played:");
    n = sc.nextInt();
    int[] scores = new int[n];
    int max_score = 0;
    for (int i = 0; i < n; i++) {
      System.out.println("Enter the highest score in match " + (i + 1) + ":");
      scores[i] = sc.nextInt();
      if (scores[i] > max_score) {
        max_score = scores[i];
      }
    }
    System.out.println("Highest score: " + max_score);
    //Calculating Lowest Score :

    int min_score = scores[0];
    for (int i = 1; i < n; i++) {
      if (scores[i] < min_score) {
        min_score = scores[i];
      }
    }
    System.out.println("Lowest score: " + min_score);
    //Calculating Average Score :

    double average_score = (double) runs / n;
    System.out.printf("Average score: %.2f\n", average_score);
    //Calculating Highest Wicket Taker :

    System.out.println("Enter the number of matches played:");
    n = sc.nextInt();
    String[] names = new String[n];
    int[] highest_wickets = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Enter the name of batsman in match " + (i + 1) + ":");
      names[i] = sc.next();
      System.out.println("Enter the number of wickets taken by " + names[i] + ":");
      highest_wickets[i] = sc.nextInt();
    }
    int max_wickets = highest_wickets[0];
    String highest_wicket_taker = names[0];
    for (int i = 1; i < n; i++) {
      if (highest_wickets[i] > max_wickets) {
        max_wickets = highest_wickets[i];
        highest_wicket_taker = names[i];
      }
    }
    System.out.println("Highest wicket taker: " + highest_wicket_taker);
    //Calculating Lowest Wicket Taker :

    int min_wickets = highest_wickets[0];
    for (int i = 1; i < n; i++) {
      if (highest_wickets[i] < min_wickets) {
        min_wickets = highest_wickets[i];
      }
    }
    System.out.println("Lowest wicket taker: " + names[highest_wickets.length - min_wickets]);
    //Calculating Highest Average :

    System.out.println("Enter the number of matches played:");
    n = sc.nextInt();
    double[] averages = new double[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Enter the average score in match " + (i + 1) + ":");
      averages[i] = sc.nextDouble();
    }
    double max_average = averages[0];
    for (int i = 1; i < n; i++) {
      if (averages[i] > max_average) {
        max_average = averages[i];
      }
    }
    System.out.println("Highest average: " + max_average);
    //Calculating Lowest Average :

    double min_average = averages[0];
    for (int i = 1; i < n; i++) {
      if (averages[i] < min_average) {
        min_average = averages[i];
      }
    }
    System.out.println("Lowest average: " + min_average);
    //Calculating Highest Strike Rate :

    double[] strike_rates = new double[n];
    for (int i = 0; i < n; i++) {
      strike_rates[i] = (double) runs / total_balls;
    }
    double max_strike_rate = strike_rates[0];
    for (int i = 1; i < n; i++) {
      if (strike_rates[i] > max_strike_rate) {
        max_strike_rate = strike_rates[i];
      }
    }
    System.out.println("Highest strike rate: " + max_strike_rate);
    //Calculating Lowest Strike Rate :

    double min_strike_rate = strike_rates[0];
    for (int i = 1; i < n; i++) {
      if (strike_rates[i] < min_strike_rate) {
        min_strike_rate = strike_rates[i];
      }
    }
    System.out.println("Lowest strike rate: " + min_strike_rate);
    //Calculating Highest Economy Rate :

    double[] economy_rates = new double[n];
    for (int i = 0; i < n; i++) {
      economy_rates[i] = (double) runs / total_overs;
    }
    double max_economy_rate = economy_rates[0];
    for (int i = 1; i < n; i++) {
      if (economy_rates[i] > max_economy_rate) {
        max_economy_rate = economy_rates[i];
      }
    }
    System.out.println("Highest economy rate: " + max_economy_rate);
    //Calculating Lowest Economy Rate :
    
    double min_economy_rate = economy_rates[0];
    for (int i = 1; i < n; i++) {
      if (economy_rates[i] < min_economy_rate) {
        min_economy_rate = economy_rates[i];
      }
    }
    System.out.println("Lowest economy rate: " + min_economy_rate);
    sc.close();
  }
}







// def calculator(expression):
//     try:
//         # Evaluate the expression safely
//         result = eval(expression)
//         return result
//     except ZeroDivisionError:
//         return "Error: Division by zero"
//     except Exception as e:
//         return f"Error: {e}"

// # Input: A single arithmetic expression
// expression = input("Enter an arithmetic expression (e.g., '10 + 20'): ")

// # Output: The result of the calculation
// result = calculator(expression)
// print(result)
