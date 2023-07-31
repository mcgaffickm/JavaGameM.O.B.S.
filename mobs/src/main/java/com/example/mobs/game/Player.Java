public class Player{
    
    //Declares basic stats of the player
        boolean bot;
        Mech mech;

    //Constructor determining if player controlled or bot controlled.
    public Player(boolean bot)
    {
        this.bot = bot;
        mech = new Mech();
    }

    //Returns for the bot status.
    boolean getBot()
    {
        return bot;
    }

    
}