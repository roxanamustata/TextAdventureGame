package game.model;

import java.security.cert.CertificateEncodingException;

public class Game {

    private Object[][] gameBoard;

    /**
     * Create a game object
     *
     * @param gameBoardSize gives the size of the array that keeps artifacts
     */
    public Game(int gameBoardSize) {
        gameBoard = new Object[gameBoardSize][gameBoardSize];
    }

    /**
     * This method will add an object tot the board on the given position
     *
     * @param obj       to place
     * @param vertical  position
     * @param orizontal position
     * @return true if the object can be placed; false if there is already an object there,
     * or throw ArrayIndexOutofBoundsException if the positions are outside the limits of the board
     */
    public boolean placeOnBoard(Object obj, int vertical, int orizontal) {
        return false;

    }

    /**
     * Remove object from the board
     *
     * @param vertical  position
     * @param orizontal position
     * @return the object to remove; null if the cell is empty
     */
    public Object removeFromBoard(int vertical, int orizontal) {
        return null;

    }



    /*

    a cell is maximum 10 spaces size. We put an artifact in the middle of the cell
     */

    private final int CELL_DIPLAY_SIZE = 10;

    private String generateSpaces(int number) {
        String spaces = "";
        for (int i = 0; i < number; i++) {
            spaces += " ";
        }
        return spaces;
    }

    private String centerCell(String input) {

        String output = "";
        output += generateSpaces((CELL_DIPLAY_SIZE - input.length()) / 2) + input + generateSpaces((CELL_DIPLAY_SIZE - input.length()) / 2);
        return output;
    }


    public String displayBoard() {
        String toReturn = "";

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                if(gameBoard[i][j] == null){
                    toReturn+=generateSpaces(CELL_DIPLAY_SIZE);
                }else{
                toReturn+=centerCell(gameBoard[i][j].getClass().getSimpleName());

                }

            }
            toReturn+="\n";
        }
        return toReturn;

    }


}
