import java.util.Random;

public class Main extends MainGame{
    public static void main(String[] args) {
        new StartPage();
        Random first_turn = new Random();
        boolean turn = first_turn.nextBoolean();
        String tstring;
        if(turn) {
            tstring = "O";
        }
        else {
            tstring = "X";
        }
        MainGame mg = new MainGame();
        int i = 9;
        while(i > 0) {
            i--;
            if(winningCominbation(mg)) {
                System.out.print("You have won!!");
                break;
            }
        }
    }

    static boolean winningCominbation(MainGame game) {
        if(game.button1.getText().equals("X") && game.button2.getText().equals("X") && game.button3.getText().equals("X")) { /* when button1, button2 and button3 are marked X */
            return true;
        }
        else if(game.button4.getText().equals("X") && game.button5.getText().equals("X") && game.button6.getText().equals("O")) { /* when button4, button5 and button6 are marked X */
            return true;
        }
        else if(game.button2.getText().equals("X") && game.button5.getText().equals("X") && game.button8.getText().equals("O")) { /* when button2, button5 and button8 are marked X */
            return true;
        }
        else if(game.button1.getText().equals("X") && game.button4.getText().equals("X") && game.button7.getText().equals("X")) { /* when button1, button4, and button7 are marked X */
            return true;
        }
        else if(game.button3.getText().equals("X") && game.button6.getText().equals("X") && game.button9.getText().equals("X")) { /* when button3, button6 and button9 are marked X */
            return true;
        }
        else if(game.button7.getText().equals("X") && game.button8.getText().equals("X") && game.button9.getText().equals("X")) { /* when button7, button8 and button9 are makred X */
            return true;
        }
        else if(game.button1.getText().equals("X") && game.button5.getText().equals("X") && game.button9.getText().equals("X")) { /* when button1, button5 and button9 are marked */
            return true;
        }
        else if(game.button3.getText().equals("X") && game.button5.getText().equals("X") && game.button7.getText().equals("X")) { /* when button3, button5 and button7 are marked X */
            return true;
        }
        else if(game.button1.getText().equals("O") && game.button2.getText().equals("O") && game.button3.getText().equals("O")) { /* when button1, button2 and button3 are marked O */
            return true;
        }
        else if(game.button1.getText().equals("O") && game.button4.getText().equals("O") && game.button7.getText().equals("O")) { /* when button1, button4, and button7 are marked O */
            return true;
        }
        else if(game.button4.getText().equals("O") && game.button5.getText().equals("O") && game.button6.getText().equals("O")) { /* when button4, button5, and button6 are marked O */
            return true;
        }
        else if(game.button2.getText().equals("O") && game.button5.getText().equals("O") && game.button8.getText().equals("O")) { /* when button2, button5, and button8 are marked O */
            return true;
        }
        else if(game.button3.getText().equals("O") && game.button6.getText().equals("O") && game.button9.getText().equals("O")) { /* when button3, button6 and button9 are marked O */
            return true;
        }
        else if(game.button7.getText().equals("O") && game.button8.getText().equals("O") && game.button9.getText().equals("O")) { /* when button7, button8 and button9 are marked O */
            return true;
        }
        else if(game.button1.getText().equals("O") && game.button5.getText().equals("O") && game.button9.getText().equals("O")) { /* when button1, button5 and button9 are marked O */
            return true;
        }
        else if(game.button3.getText().equals("O") && game.button5.getText().equals("O") && game.button7.getText().equals("O")) { /* when button3, button5 and button7 are marked O */
            return true;
        }
        return false;
    }
}