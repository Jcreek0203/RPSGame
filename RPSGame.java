import javax.swing.JOptionPane;
import java.util.*;

class RPSGame{
    public static void main(String[] args){
        boolean b = false;
        String answer = null;
        int playerOne = 0, playerTwo = 0;
        Random rand = new Random();
        while(!b){
            try{
                playerOne = Integer.parseInt(JOptionPane.showInputDialog(null, "1=Rock 2=Paper or 3=Scissors?"));
                b = true;
            }
            catch(Exception e){
                b = false;
            }
        }
        playerTwo = rand.nextInt(3)+1;
        System.out.println(playerTwo);
        
        
        
        
    }

}