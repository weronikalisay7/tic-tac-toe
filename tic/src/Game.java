import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    String[] gameField = new String[9];
    String turn;
    Informer informer=new Informer();

    public  void NewGame(Scanner in){
        turn = "X";
        fillEmptyGameField();
        informer.gameFieldInformer(gameField);
        while (checkWinner() == null) {
            int numInput;
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    informer.invalidInputSlot();
                    continue;
                }
            } catch (InputMismatchException e) {
                informer.invalidInputSlot();
                continue;
            }
            turnToNextPlayer(numInput);
        }
        if (checkWinner().equals("draw")) {
            Menu.Draws++;
            informer.drawInformer();
        } else {
            if(checkWinner()=="X")
                Menu.winsX++;
            else Menu.winsO++;
            informer.winInformer(checkWinner());
        }

    }

    void turnToNextPlayer(int numInput){
        if (gameField[numInput - 1].equals(String.valueOf(numInput))) {
            gameField[numInput - 1] = turn;
            if (turn.equals("X")) {
                turn = "O";
            } else {
                turn = "X";
            }
            informer.gameFieldInformer(gameField);

        } else {
            informer.errorInformer();
        }

    }

    String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = gameField[0] + gameField[1] + gameField[2];
                    break;
                case 1:
                    line = gameField[3] + gameField[4] + gameField[5];
                    break;
                case 2:
                    line = gameField[6] + gameField[7] + gameField[8];
                    break;
                case 3:
                    line = gameField[0] + gameField[3] + gameField[6];
                    break;
                case 4:
                    line = gameField[1] + gameField[4] + gameField[7];
                    break;
                case 5:
                    line = gameField[2] + gameField[5] + gameField[8];
                    break;
                case 6:
                    line = gameField[0] + gameField[4] + gameField[8];
                    break;
                case 7:
                    line = gameField[2] + gameField[4] + gameField[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(gameField).contains(String.valueOf(a+1))) {
                break;
            }
            else if(a==8)
                return "draw";
        }
        informer.turnInformer(turn);
        return null;
    }

    void fillEmptyGameField() {
        for (int a = 0; a < 9; a++) {
            gameField[a] = String.valueOf(a+1);
        }
    }
}
