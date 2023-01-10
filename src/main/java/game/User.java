package game;

import java.util.Random;
import java.util.Scanner;

public class User {
    private Scanner scanner;

    public User() {
        scanner = new Scanner(System.in);
    }

    public Game.Move getMove () {
        System.out.println("Камень, ножницы или бумага?");
        String playerChoice = scanner.nextLine();
        playerChoice = playerChoice.toUpperCase();
        char firstSimbol = playerChoice.charAt(0);
        switch (firstSimbol) {
            case 'К':
                return Game.Move.ROCK;
            case 'Н':
                return Game.Move.SCISSORS;
            case 'Б':
                return Game.Move.PAPER;
            default:
                return getMove();
        }
    }
}
