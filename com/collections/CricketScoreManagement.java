package com.collections;
import java.util.HashMap;
import java.util.Map;

public class CricketScoreManagement {
    public static void main(String[] args) {

        // Step 1: Create HashMap
        HashMap<String, Integer> players = new HashMap<>();

        // Step 2: Insert 5 players
        players.put("Virat", 90);
        players.put("Rohit", 45);
        players.put("Dhoni", 65);
        players.put("Rahul", 30);
        players.put("Hardik", 78);

        System.out.println("Cricket Scores:");
        System.out.println(players);

        // Step 3: Update a player's score
        players.put("Rohit", 55);

        System.out.println("\nAfter Updating Rohit's Score:");
        System.out.println(players);

        // Step 4: Display players scoring more than 50
        System.out.println("\nPlayers Scoring More Than 50:");

        for (Map.Entry<String, Integer> entry : players.entrySet()) {

            if (entry.getValue() > 50) {
                System.out.println(
                    entry.getKey() + " : " + entry.getValue()
                );
            }
        }

        // Step 5: Find highest-scoring player
        String highestPlayer = "";
        int highestScore = 0;

        for (Map.Entry<String, Integer> entry : players.entrySet()) {

            if (entry.getValue() > highestScore) {
                highestScore = entry.getValue();
                highestPlayer = entry.getKey();
            }
        }

        System.out.println("\nHighest Scoring Player:");
        System.out.println(highestPlayer + " : " + highestScore);

        // Step 6: Remove a player
        players.remove("Rahul");

        System.out.println("\nAfter Removing Rahul:");
        System.out.println(players);
    }
}
