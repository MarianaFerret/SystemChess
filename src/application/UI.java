package application;

import chess.ChessPicie;

public class UI {
    
    public static void printBord(ChessPicie[][] picies){
        for(int i = 0; i < picies.length; i++){
            System.out.print((8-i) + "");

            for(int j = 0; j < picies.length; j++){
                printPicie(picies[i][j]);
            }

            System.out.println();
        }

        System.out.println("  a b c d e f g h");
    }

    private static void printPicie(ChessPicie picie){
        if(picie == null){
            System.out.print(" -");
        }
        else{
            System.out.print(picie);
        }
    }
}
