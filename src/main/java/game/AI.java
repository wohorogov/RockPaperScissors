package game;

import java.util.Random;

public class AI extends Player {

    public Game.Move getMove() {
        Game.Move[] move = Game.Move.values();
        Random random = new Random();
        int moveNumber = random.nextInt(move.length);
        return move[moveNumber];
    }

}
