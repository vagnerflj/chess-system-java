package Application;

import boardgame.Board;
import chess.ChessMatch;

public class Program {
    public static void main(String[] args){

        ChessMatch cheessMatch = new ChessMatch();
        UI.printBoard(cheessMatch.getPieces());
    }
}
