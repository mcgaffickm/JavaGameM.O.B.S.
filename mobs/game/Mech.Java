public class Mech{
    
    //Variables that represent the mech
    int health;
    ModificationChip mods;

    /*
     * The constructor for the mech, health and image
     */
    public Mech()
    {
        //Only option at least in beginning
        health = 3; 
    }

    //Sets and returns the health of the player
    void setHealth(int health)
    {
        this.health = health;
    }

    int getHealth()
    {
        return health;
    }
}