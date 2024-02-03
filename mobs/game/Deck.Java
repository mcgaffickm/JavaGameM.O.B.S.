import java.util.ArrayList;
package cards;

public class Deck{
    //Declares two arrays to hold cards, size subject to change so array list
    ArrayList<AttackCards> attackCards = new ArrayList<AttackCards>();
    ArrayList<DefenseCards> defenseCards = new ArrayList<DefenseCards>();

    /*
     * Declares the standard size deck
     */
    public Deck()
    {
        //First the attack cards
        for(int j = 1; j <= 5; j++)
        {
            attackCards.add(new AttackCard(j))
        }

        //Second the Defense cards
        for(int j = 1; j <= 3; j++)
        {
            defenseCards.add(new DefenseCard(j))
        }
    }
}