import java.util.ArrayList;
public Class Battle{
    
    //Sets the basics of a battle. holds the rounds, players etc
    ArrayList<Round> rounds = new ArrayList<Round>();
    ArrayList<Player> players = new ArrayList<Player>();
    boolean battleOver;
    int totalRounds;
    int totalPlayers;
//test
    //Sets the default values and gets the players
    public Battle(ArrayList<Player> players)
    {
        battleOver = false;
        totalRounds = 5;
        this.players = players;
        totalPlayers = players.size();
    }

    //Saves what happens into round
    public boolean runARound()
    {
        //Does the battle


        //Creates round and saves what happened
        //Round newRound = new Round();
        

        return checkIfOver();
    }

    //Checks if the battle is over
    private boolean checkIfOver()
    {
        //Checks if the rounds are over based on total length
        if(totalRounds == rounds.size())
        {
            return true;
        }

        //Checks all of the players healths
        for(Player p: players)
        {
            if(p.health == 0)
            {
                return true;
            }
        }

        //Returns false to keep going
        return false;
    }

    private Player findWinner()
    {

    }

}