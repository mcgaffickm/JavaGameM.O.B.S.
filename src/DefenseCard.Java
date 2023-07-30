public class DefenseCard
{
    //Declares the basic variables that make up a defense card
    char symbol;
    String name;

    /*
     * Constructor that sets the values based on the type of defense
     */
    public DefenseCard(int type)
    {
        //Choices the symbol and name based on the type, only 3 for defense
        switch (type)) {
            case 1:
                symbol = '<'
                name = "Quick Counter"
                break;
            case 2:
                symbol = '>'    
                name = "Strong Shield"
                break;
            case 3:
                symbol = '='
                name = "Foresight"
                break;
            default:
                break;
        }
    }

    /*
     * Getter method for symbol
     */
    char getSymbol()
    {
        return symbol;
    }

    /*
     * Getter method for name
     */
    String getName()
    {
        return name;
    }
}