import javax.swing.JOptionPane;
import java.util.*;

class RPSGame{
    public static void main(String[] args){
        boolean b, c = true;
        String answer = null, playerOneMessage = null, playerTwoMessage = null;
        int playerOneInt = 0, playerTwoInt = 0, response;
        Random rand = new Random();
        while(c){
            b = false;
            while(!b){
                try{
                    playerOneInt = Integer.parseInt(JOptionPane.showInputDialog(null, "1=Rock 2=Paper or 3=Scissors?"));
                    b = true;
                    if(playerOneInt >= 4 || playerOneInt <= 0){
                        JOptionPane.showMessageDialog(null, "You must choose a valid number!");
                        b = false;
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "You must choose a number!");
                    b = false;
                }
                
            }
            playerTwoInt = rand.nextInt(3)+1;
            System.out.println(playerTwoInt);
            switch(playerOneInt){
                case 1:
                    playerOneMessage = "You have choosen Rock.";
                    break;
                case 2:
                    playerOneMessage = "You have choosen Paper.";
                    break;
                case 3:
                    playerOneMessage = "You have choosen Scissors.";
                    break;
            }
            System.out.println(playerOneMessage);
            switch(playerTwoInt){
                case 1:
                    playerTwoMessage = "Computer has choosen Rock.";
                    break;
                case 2:
                    playerTwoMessage = "Computer has choosen Paper.";
                    break;
                case 3:
                    playerTwoMessage = "Computer has choosen Scissors.";
                    break;
            }
            System.out.println(playerTwoMessage);
            if(playerOneInt == playerTwoInt){
                response = JOptionPane.showConfirmDialog(null, playerOneMessage + "\n" +
                                              playerTwoMessage + "\n" + "Draw. \nPlay again?");
            }
            else if (playerOneInt == 3 && playerTwoInt == 1){
                response = JOptionPane.showConfirmDialog(null, playerOneMessage + "\n" +
                                              playerTwoMessage + "\n" + "You lose. \nPlay again?");
            }
            else if (playerOneInt == 1 && playerTwoInt == 3){
                response = JOptionPane.showConfirmDialog(null, playerOneMessage + "\n" +
                                              playerTwoMessage + "\n" + "You win. \nPlay again?");
            }
            else if(playerOneInt > playerTwoInt){
                response = JOptionPane.showConfirmDialog(null, playerOneMessage + "\n" +
                                              playerTwoMessage + "\n" + "You win. \nPlay again?");
            }
            else{
                response = JOptionPane.showConfirmDialog(null, playerOneMessage + "\n" +
                                              playerTwoMessage + "\n" + "You lose. \nPlay again?");
            }
            if(response == JOptionPane.NO_OPTION){
                c = false;
                JOptionPane.showMessageDialog(null, "Thank you for playing!");
            }
        }
        
    }
}