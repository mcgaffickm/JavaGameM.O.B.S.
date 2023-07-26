public class AttackCard
{
    //Declares the basic variables that make up an attack card
    int value;
    String name;

    /*
     * Constructor that sets the values based on the type of attack
     */
    public AttackCard(int type)
    {
        //Choices the symbol and name based on the type, only 5 for now
        switch (type)) {
            case 1:
                value = 1;
                name = "Small Slash"
                break;
            case 2:
                value = 2;    
                name = "Quick Slash"
                break;
            case 3:
                value = 3;
                name = "Standard Strike"
                break;
            case 4:
                value = 4;
                name = "Heavy Blow"
                break;
            case 5:
                value = 5;
                name = "Heavy Smash"
                break;
            default:
                break;
        }
    }

    /*
     * Getter method for value
     */
    char getValue()
    {
        return value;
    }

    /*
     * Getter method for name
     */
    String getName()
    {
        return name;
    }
}