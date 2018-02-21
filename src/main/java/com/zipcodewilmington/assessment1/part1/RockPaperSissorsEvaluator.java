package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    // rock beats scissors
    // scissors beats paper
    // paper wraps/beats rock

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        if (handSign.equals(PAPER)) {
            return SCISSOR;
        } else if (handSign.equals(ROCK)) {
            return PAPER;
        } else if (handSign.equals(SCISSOR)) {
            return ROCK;
        }
        return "Error in Argument";
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if (handSign.equals(PAPER)) {
            return ROCK;
        } else if (handSign.equals(ROCK)) {
            return SCISSOR;
        } else if (handSign.equals(SCISSOR)) {
            return PAPER;
        }
        return "Error in Argument";
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */

    // P1 ROCK, P2 SCISSOR
    // P1 PAPER, P2 SCISSOR
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        // Bo won the Coding Dragon for this effort.
        if (handSignOfPlayer1.equals(handSignOfPlayer2)) {
            return "TIE";
        }
        if(getWinningMove(handSignOfPlayer1).equals(getLosingMove(handSignOfPlayer2))){
            return handSignOfPlayer1;
        }
        else if(getWinningMove(handSignOfPlayer2).equals(getLosingMove(handSignOfPlayer1))){
            return handSignOfPlayer2;
        }
        return "Error in Argument";
    }
}
