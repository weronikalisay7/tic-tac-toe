import java.util.Scanner;

public class Menu {
    Informer informer=new Informer();
    Scanner in;
    public static  int winsX=0;
    public static  int winsO=0;
    public static int Draws=0;

    int choiceInput() {
        informer.yourChoiceInformer();
        int yourChoice = in.nextInt();
        while (!(yourChoice >= 0 && yourChoice <= 2)) {
            informer.invalidInputInMenu();
            yourChoice = in.nextInt();
        }
        return yourChoice;
    }
    public void startProgram(){
        int yourChoice;
        in = new Scanner(System.in);
        do {
            informer.menuInformer();
            yourChoice = choiceInput();
            switch (yourChoice) {
                case 0: {
                    Game game=new Game();
                    game.NewGame(in);
                    break;
                }
                case 1:{
                    informer.resultsInformer();
                    break;}
                case 2:{
                    System.exit(0);
                }
            }
        }
        while (yourChoice != 2) ;
    }
}
