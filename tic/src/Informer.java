public class Informer {
    public void gameFieldInformer(String[] gameField) {
        System.out.println("/---|---|---\\");
        System.out.println("| "
                + gameField[0]  + " | "
                + gameField[1]  + " | "
                + gameField[2]  + " |");
        System.out.println("|-----------|");
        System.out.println("| "
                + gameField[3]  + " | "
                + gameField[4]  + " | "
                + gameField[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| "
                + gameField[6]  + " | "
                + gameField[7]  + " | "
                + gameField[8]  + " |");
        System.out.println("\\---|---|---/");
    }

    public void errorInformer() {
        System.out.println("Slot already taken; re-enter slot number:");
    }

    public void turnInformer(String turn) {
        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
    }

    public void winInformer(String winner) {
        System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
    }

    public void drawInformer() {
        System.out.println("It's a draw! Thanks for playing.");
    }

    public void yourChoiceInformer(){
        System.out.println("Enter your choice");
    }
    public void invalidInputSlot(){
        System.out.println("Invalid input; re-enter slot number:");
    }
    public void invalidInputInMenu(){
        System.out.println("Invalid input; enter your choice:");
    }

    public  void resultsInformer(){
        System.out.println(
                "X's wins: "+ Menu.winsX+
                        "\nO's wins: " + Menu.winsO+
                        "\nDraws:"+ Menu.Draws+"\n");
    }
    public void menuInformer() {
        System.out.println(
                "0) New Game\n" +
                        "1) Results\n" +
                        "2) Exit\n");
    }
}