public class BattleManager{
    
    //Sets up player battle to start
    ArrayList<Player> players;

    public BattleManager()
    {
        players = new ArrayList<Player>();
    }

    /*
     * Adds the players to the battle
     */
    public void setPlayers(int human, int total)
    {
        //Adds all the players, will be capped at 4 eventually
        if(int j = 0; j<total; j++)
        {
            boolean bot = true;

            //Checks if human or bot
            if(j<human) 
                bot = false;
            
            //Adds the players
            players.add(new Player(bot));
        }
    }
}