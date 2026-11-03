
package consoleApplications;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// SNAKE AND LADDER GAME

public class SnakeAndLadders {

    public static void main(String[] args) {

        // Create players
        Player p1 = new Player("Ram");
        Player p2 = new Player("Zara");

        List<Player> playerlist = new ArrayList<>();

        playerlist.add(p1);
        playerlist.add(p2);

        // Start the game
        startGame(playerlist);
    }

    public static void startGame(List<Player> playerlist) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        // LADDERS
        HashMap<Integer, Integer> ladder = new HashMap<>();

        ladder.put(5, 30);
        ladder.put(15, 40);
        ladder.put(23, 98);
        ladder.put(36, 70);
        ladder.put(50, 80);

        // SNAKES
        HashMap<Integer, Integer> snake = new HashMap<>();

        snake.put(99, 9);
        snake.put(90, 35);
        snake.put(78, 55);
        snake.put(66, 17);
        snake.put(72, 26);

        int currentIndex = 0;

        System.out.println("================================");
        System.out.println("     SNAKE AND LADDER GAME");
        System.out.println("================================");
        System.out.println("Game Started!");

        // GAME LOOP
        while (true) {

            Player player = playerlist.get(currentIndex);

            System.out.println("\nPlayer Turn: " + player.getName());
            System.out.println("Current Position: " + player.getPosition());

            System.out.println("Press ENTER to roll the dice!");
            sc.nextLine();

            // Roll dice
            int dice = ran.nextInt(6) + 1;

            System.out.println("Dice Value: " + dice);

            // Calculate new position
            int newPosition = player.getPosition() + dice;

            // Check position exceeds 100
            if (newPosition > 100) {

                System.out.println(
                    "Position exceeds 100. Your turn is skipped!"
                );

            } else {

                // Check ladder
                if (ladder.containsKey(newPosition)) {

                    System.out.println("\nCongratulations! You found a ladder!");

                    System.out.println(
                        "Moving from " + newPosition +
                        " to " + ladder.get(newPosition)
                    );

                    player.setPosition(ladder.get(newPosition));
                }

                // Check snake
                else if (snake.containsKey(newPosition)) {

                    System.out.println("\nOops! A snake bit you!");

                    System.out.println(
                        "Moving from " + newPosition +
                        " to " + snake.get(newPosition)
                    );

                    player.setPosition(snake.get(newPosition));
                }

                // Normal movement
                else {

                    player.setPosition(newPosition);
                }

                System.out.println(
                    "Current Position: " + player.getPosition()
                );

                // Check winner
                if (player.getPosition() == 100) {

                    System.out.println("\n================================");
                    System.out.println(
                        "Congratulations " + player.getName() + "!"
                    );
                    System.out.println("YOU WON THE GAME!");
                    System.out.println("================================");

                    break;
                }
            }

            // Extra turn when dice value is 6
            if (dice == 6) {

                System.out.println(
                    "\nYou rolled a 6! You can play again!"
                );

                continue;
            }

            // Move to next player
            currentIndex = (currentIndex + 1) % playerlist.size();
        }

        sc.close();
    }
}

// PLAYER CLASS

class Player {

    private String name;
    private int position;

    // Constructor
    public Player(String name) {

        this.name = name;
        this.position = 0;
    }

    // Get player name
    public String getName() {

        return name;
    }

    // Set player name
    public void setName(String name) {

        this.name = name;
    }

    // Get player position
    public int getPosition() {

        return position;
    }

    // Set player position
    public void setPosition(int position) {

        this.position = position;
    }

    // Display player details
    @Override
    public String toString() {

        return "Player [name=" + name +
               ", position=" + position + "]";
    }
}
