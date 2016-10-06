import javax.swing.JOptionPane;
import java.util.*;

class RPSGame{
    public static void main(String[] args){
        boolean b = false;
        String answer = null, playerOneMessage = null, playerTwoMessage = null;
        int playerOneInt = 0, playerTwoInt = 0;
        Random rand = new Random();
        while(!b){
            try{
                playerOneInt = Integer.parseInt(JOptionPane.showInputDialog(null, "1=Rock 2=Paper or 3=Scissors?"));
                b = true;
            }
            catch(Exception e){
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
            JOptionPane.showMessageDialog(null, playerOneMessage + "\n" +
                                          playerTwoMessage + "\n" + "Draw.");
        }
        else if (playerOneInt == 3 && playerTwoInt == 1){
            JOptionPane.showMessageDialog(null, playerOneMessage + "\n" +
                                          playerTwoMessage + "\n" + "You lose.");
        }
        else if(playerOneInt > playerTwoInt){
            JOptionPane.showMessageDialog(null, playerOneMessage + "\n" +
                                          playerTwoMessage + "\n" + "You win.");
        }
        else{
            JOptionPane.showMessageDialog(null, playerOneMessage + "\n" +
                                          playerTwoMessage + "\n" + "You lose.");
        }
        
    }
}