package application;

import chess.ChessMatch;

public class Programs {

	public static void main(String[] args) {
		
		ChessMatch chessMach = new ChessMatch();
		UI.printBoard(chessMach.getPieces());
		
		System.out.print(" ");

	}
}
