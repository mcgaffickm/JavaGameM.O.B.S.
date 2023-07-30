public class ModificationChip
{
    //Declares the basic details of modification chip
    String description;
    String name;
    int type;


    /*
     * The standard constructor that chooses your modification chip
     */
    public ModificationChip(int type)
    {
        this.type = type;
        
        //Determines which chip was chosen
        switch(type)
        {
            case 1:
                name = "";
                description = "";
                break;
            case 2:
                name = "";
                description = "";
                break;
            case 3:
                name = "";
                description = "";
                break;
            case 4:
                name = "";
                description = "";
                break;
            case 5:
                name = "";
                description = "";
                break;
            case 6:
                name = "";
                description = "";
                break;
            case 7:
                name = "";
                description = "";
                break;
            case 8:
                name = "";
                description = "";
                break;
            default
                break;
        }
    }
}

/*
 * Overdrive - Attacks deal double for the first two rounds.  The last three rounds, you must play a three everytime.
Immunity - You will not take damage whenever you play a three.
Self Repair - Replace a missing part for every two hits of damage you deal
Better Evasion	 - Heavy attacks (4,5) cannot deal damage to you except with foresight (=).
Stronger Armor - Weak attacks (1,2) will not deal damage to you until you have lost at least one part.
Failsafe - Destroy one of your parts in order to play another heavy smash (5) after cards have been shown
Radar Jammer	- Prevents the use of foresight (=) for you and your opponent’s defense against you.
Dispelling Wave - Other player’s abilities will not affect you.  You will attack and defend normally.
ERROR - This chip is broken.  You will have no abilities for this battle.
Increased Attack - You can deal heavy attacks (4, 5) unlimitedly, but all attacks are exhausted in the 4th round.  Your attack will be represented as 0 in the fifth round and you cannot use defense techniques.
Quicker Agility - You can deal quick attacks (1,2) unlimitedly, but all attacks are exhausted in the 4th round.  Your attack will be represented as 0 in the fifth round and you cannot use defense techniques.
Hacking Tools	- Make an opponent play a three during one round of your choosing.  Must be used before cards are turned over.
Infinite Stamina - Your attack techniques will never exhaust.  You will deal damage 
Self Destruct - Upon losing all parts, deal one damage to all opponents that didn’t use Strong Shield on you in that round.
Air Strike - Fire upon the battlefield one time before a round and everyone takes 1 damage (including you)
Malware - Whenever you play a small slice (1), any foresight used against you during that round will damage to you.
	
 */