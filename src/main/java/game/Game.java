package game;

import java.util.Scanner;

public class Game {
    public void start() {
        User user = new User();
        AI ai = new AI();
        int isTheEnd = 1;
        Scanner scanner = new Scanner(System.in);
        while (isTheEnd == 1) {
            Move moveAI = ai.getMove();
            Move moveUser = user.getMove();
            System.out.println("Ваш ход " + moveUser);
            System.out.println("Ход компьютера " + moveAI);
            int result = moveUser.compareMoves(moveAI);
            switch (result) {
                case 0: {
                    System.out.println("Ничья!");
                    break;
                }
                case 1: {
                    System.out.println("Вы победили!");
                    break;
                }
                case -1: {
                    System.out.println("Вы проиграли!");
                    break;
                }
                default:
                    System.out.println("Произошла ошибка");
                    break;
            }
            isTheEnd = 3;
            while (isTheEnd != 0 && isTheEnd != 1) {
                System.out.println("Хотите сыграть еще раз? 1 - да, 0 - нет.");
                isTheEnd = scanner.nextInt();
                System.out.println(isTheEnd);
            }
        }
    }

    public enum Move {
        ROCK, PAPER, SCISSORS;

        public int compareMoves(Move otherPlayer) {
            if (this == otherPlayer) {
                return 0;
            }

            switch (this) {
                case ROCK: return (otherPlayer == SCISSORS ? 1 : -1);
                case PAPER: return (otherPlayer == ROCK ? 1 : -1);
                case SCISSORS: return (otherPlayer == PAPER ? 1 : -1);
            }

            return 0;
        }
    }
}
