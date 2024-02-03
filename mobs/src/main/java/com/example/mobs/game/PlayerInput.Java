import java.util.Scanner;
public class playerInput
{
    boolean bot;
    public playerInput(boolean bot)
    {
        this.bot = bot;
    }

    public char[] getInput()
    {

    }

    /*
     * Gets the attack card from the player
     */
    public char attackChosen()
    {
        char attack;
        if(!bot)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your attack card:")
            attack = sc.nextChar();
            return attack;
        }
        else
        {
            //gets random 
            return attack;
        }
    }


    /*
     * Gets the defense card from the player
     */
    public char defenseChosen()
    {
        char defense;
        if(!bot)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your defense card:")
            defense = sc.nextChar();
            return defense;
        }
        else
        {
            //gets random
            return defense;
        }
    }
}