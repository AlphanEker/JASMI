package classes;

/**
 * Class which contains the infromation for the date 
 * @author Alphan Eker
 * @version 23.04.2021
 */
public class Day {
    
        // Variables
        int whichDay;
        boolean available;
        String note;
    
        //constructor for day to be used in Date class
        public Day( int x){
            whichDay = x;
            available = true;
            note = " is available.";
    
        }
    
        /**
         * Method which prints the information of a certain day
         */
        @Override
        public String toString() {
            return " April " + whichDay + note;
        }

        /**
         * Method which gets the note of a certain day
         * @return note as a String type piece of information
         */
        public String getNote(){

            return note;
        }
    
	/**
         * Method which sets the note of a certain day
         * @param x is a int type parameter which is used as an indicator to decide on whether to set note or not
         */
        protected void setNote(int x){
            if(x == 0){

                note = " has been booked.";
            }

            if (x == 1) {
                
                note = " has an appointment.";
            }
        
        }
        
        /**
         * Overloaded method which sets the note of a certain day
         * @param info is a String type piece of information to be set
         */
        protected void setNote (String info) {
        	note = info;
        }

        /**
         * Method which is used to check availibility
         * @return available as a boolean statement
         */
        public boolean getAvailability() {
            return available;
        }

        /**
         * Method which is used to set availibility false
         */
        public void setAvailabilityFalse() {

            available = false;
            setNote(0);
        }
     
        /**
         * Overloaded method which is used to set availibility false
         * @param index is an int type indicator for setting a note
         */
        public void setAvailabilityFalse( int index) {

            available = false;
            setNote( index);
        }
        
	/**
         * Overloaded method which is used to set availibility false
         * @param note is an String type indicator for setting a note
         */
        protected void setAvailabilityFalse( String note) {

            available = false;
            this.note = note;
        }

        /**
         * Method which is used to set availibility true
         */
        protected void setAvailabilityTrue(){

            available = true;
        }
}
