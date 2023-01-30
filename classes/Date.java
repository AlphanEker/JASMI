package classes;
import java.lang.*;
/**
 * Class which contains the infromation for the date 
 * @author Alphan Eker
 * @version 23.04.2021
 */
public class Date {
    
    // Declare the date array
    Day dateArray[];

    /*
     * Constructor which initializes the date array
     */
    public Date(){

        // Initialize the date array
        dateArray = new Day[ 30];

        // Add days to the date array
        for (int index = 0; index < dateArray.length; index++) {
            dateArray[ index] = new Day( index + 1);
        }
    }

    /*
     * Method which gets a certain day from the dateArray
     * @param index is an int type parameter which specifies a certain day
     * @return dateArray[ index] which is a certain day of the dateArray
     */
    public Day getDay( int index){
        return dateArray[ index];
    }
}

