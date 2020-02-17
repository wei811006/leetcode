package wei.leetcode.learn.math;

import org.springframework.stereotype.Component;

/**
 * 1025 Divisor Game.
 * <p>
 * Alice and Bob take turns playing a game, with Alice starting first.
 * <p>
 * Initially, there is a number N on the chalkboard.
 * On each player's turn, that player makes a move consisting of:
 * <p>
 * Choosing any x with 0 < x < N and N % x == 0.
 * Replacing the number N on the chalkboard with N - x.
 * Also, if a player cannot make a move, they lose the game.
 * <p>
 * Return True if and only if Alice wins the game,
 * assuming both players play optimally.
 * <p>
 * 2020/02/2020/2/17
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class DivisorGame {

    public boolean divisorGame(int N) {
        return (N & 1 ) == 0;
    }

}
