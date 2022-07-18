
/**
 * Write a description of class DieUser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DieUser
{
    public static void main(String [] args) 
    {
        Die bobsDie = new Die(6);
        Die carolsDie = new Die(15);
        int numGames = 5;
        int carolWins = 0;
        int bobWins = 0;
        int tie = 0;
        
        for (int i = 0; i < numGames; i ++) {
            bobsDie.roll();
            carolsDie.roll();
            if (carolsDie.getFaceValue() > bobsDie.getFaceValue()){
                carolWins++;
                System.out.println("Carol wins this roll");
            }
            else if (bobsDie.getFaceValue() > carolsDie.getFaceValue()) {
                bobWins++;
                System.out.println("Bob wins this roll");
            }
            else{
                System.out.println("This roll is a tie");
                tie++;
            }
            System.out.println("\tCarol's " + carolsDie);
            System.out.println("\tBob's " + bobsDie);
           
        }
        
        if (carolWins > bobWins)
             System.out.println("\nCarol won the match!");
        else if (carolWins < bobWins)
             System.out.println("\nBob won the match!");
        else
             System.out.println("\nThe match ended in a tie!");
        
    }
}
