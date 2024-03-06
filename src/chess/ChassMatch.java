package chess;

import bordgame.Bord;

public class ChassMatch {
	//partida de Xadress
	private Bord bord;
	
	public ChassMatch() {
		bord = new Bord(8,8);
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[bord.getRows()][bord.getColumns()];
		for(int i = 0; i< bord.getRows(); i++) {
			for(int j=0;j<bord.getColumns();j++) {
				mat[i][j] = (ChessPiece) bord.piece(i, j);
			
		    }
	    }
		return mat;
    }
}
