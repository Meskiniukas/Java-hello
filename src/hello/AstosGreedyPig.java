package hello;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class AstosGreedyPig {
    
    public static int roll = 1;
    public static int players; // user selects how game will be played (how many players)
    public static int maxPoints = 100; // when maxPoints is reached by one of the players, game ends
    public static int rolledPoints, firstPlayer = 0, secondPlayer = 0;

    public static void main(String[] args) {
        System.out.println("Please select how many players will play: ");
        System.out.println("2 - two player game");
        System.out.println("1 - one player game");
        System.out.println("0 - comp vs comp 0");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        players = sc.nextInt();

        while (firstPlayer < maxPoints && secondPlayer < maxPoints) {
            if (players > 0) {
                System.out.println("FIRST player: ");
                firstPlayer = playersTurn(firstPlayer, "user");
                if (firstPlayer == -1) {
                    break;
                }
                System.out.println("SECOND player: ");
                if (players == 2) {
                    secondPlayer = playersTurn(secondPlayer, "user");
                    if (secondPlayer == -1) {
                        break;
                    }
                }
                if (players == 1) {
                    secondPlayer = playersTurn(secondPlayer, "comp1");
                    if (secondPlayer == -1) {
                        break;
                    }
                }
            }
            if (players == 0) {
                System.out.println("FIRST player: ");
                firstPlayer = playersTurn(firstPlayer, "comp1");
                if (firstPlayer == -1) {
                    break;
                }
                System.out.println("SECOND player: ");

                secondPlayer = playersTurn(secondPlayer, "comp2");
                if (secondPlayer == -1) {
                    break;
                }

            }
        }
        if (firstPlayer == -1) {
            System.out.println("GAME OVER. THE WINNER IS FIRST PLAYER.");
        }
        if (secondPlayer == -1) {
            System.out.println("GAME OVER. THE WINNER IS SECOND PLAYER.");
        }
    }

    public static int rollTheDice() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int point;
        while (roll == 1) {

            point = (int) (Math.random() * 6) + 1;
            if (point > 1 && point <= 6) {
                sum += point;
            }
            if (point == 1) {
                sum = 0;
                System.out.println("Rolled 1. Points earned this turn was annuled.");
                break;
            }
            System.out.println("Rolled: " + point);
            System.out.println("Sub-total: " + sum);
            if (firstPlayer + sum >= 100 || secondPlayer + sum >= 100) {
                return sum;
            }
            System.out.println("1 - roll again, 0 - STOP");
            roll = sc.nextInt();
        }
        return sum;
    }

    public static int comp1Strategy() {
        int sum = 0;
        int point;
        while (roll == 1) {
            System.out.println(firstPlayer + sum);
            for (int i = 1; i < 6; i++) {

                point = (int) (Math.random() * 6) + 1;
                if (point > 1 && point <= 6) {
                    sum += point;
                }
                if (point == 1) {
                    sum = 0;
                    System.out.println("Rolled 1. Points earned this turn was annuled.");
                    break;
                }
                if (firstPlayer + sum < maxPoints && secondPlayer + sum < maxPoints) {
                    break;
                }
                System.out.println("Rolled: " + point);
                System.out.println("Sub-total: " + sum);
                if (firstPlayer + sum >= 100 || secondPlayer + sum >= 100) {
                    return sum;
                }
                if (sum >= maxPoints) {
                    return sum;
                }
            }
            roll = 0;
        }
        return sum;
    }

    public static int comp2Strategy() {
        int sum = 0;
        int point;
        while (roll == 1) {
            while (sum < 18) {
                sum
                        = point = (int) (Math.random() * 6) + 1;
                if (point > 1 && point <= 6) {
                    sum += point;
                }
                if (point == 1) {
                    sum = 0;
                    System.out.println("Rolled 1. Points earned this turn was annuled.");
                    break;
                }
                System.out.println("Rolled: " + point);
                System.out.println("Sub-total: " + sum);
                if (firstPlayer + sum >= 100 || secondPlayer + sum >= 100) {
                    return sum;
                }
                if (sum >= maxPoints) {
                    return sum;
                }
            }
            roll = 0;
        }
        return sum;
    }

    public static int playersTurn(int player, String comp) {
        switch (comp) {
            case "user" ->
                rolledPoints = rollTheDice();
            case "comp1" ->
                rolledPoints = comp1Strategy();
            case "comp2" ->
                rolledPoints = comp2Strategy();
        }

        if (rolledPoints != 0) {
            player += rolledPoints;
            System.out.println("Points earned this turn: " + rolledPoints);
        }
        System.out.println("Result after turn: " + player);
        if (player >= maxPoints) {
            return -1;
        }
        roll = 1;
        return player;
    }
}
