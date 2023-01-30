package classes;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class DietPlan.
 */
public class DietPlan {
	
	//constants
    /** The breakfast suggestion. */
    final String[] breakfastSuggestion = {"One grapefruit, two poached eggs, two slices of whole-grain toast,\r\n a cup of low-fat milk, a cup of black coffee",
    		"1 cup cereal, 1 cup whole milk, 1 fruit, 8 ounce juice",
    		"Three eggs scrambled with two ounces cheese, two slices of whole-grain bread,\r\n fruit smoothie"};
    
    /** The lunch suggestion. */
    final String[] lunchSuggestion = {"Baked/Roasted chicken breast, a large serving of garden salad,\r\n a glass of water",
    		"1 slice pizza with meat, a side salad, a glass of juice",
    		"Macaroni and cheese: 1 cup cooked pasta with 2 ounces cheese,\r\n 1 cup cooked vegetable, 8 ounces juice"};
    
    /** The dinner suggestion. */
    final String[] dinnerSuggestion = {"One cup steamed broccoli, one cup brown rice, one portion of seafood",
    		"4 ounce grilled salmon, 1 cup brown rice, 1 cup cooked vegetable, 12 ounce water",
    		"1 cup turkey chili, 2 ounce cornbread, 8 ounces juice"};
    
    /** The exercise suggestion. */
    final String[] exerciseSuggestion = {"10 Push-ups/2 Sets,\r\n \r\n15 Forward Lunge,\r\n \r\n 1 Minute Plank/3Sets,\r\n \r\n12 Squats,\r\n \r\n15 Minutes Free Running",
    		"25 Push-ups/2 Sets,\r\n\r\n30 Forward Lunge,\r\n \r\n 1.5 Minute Plank/3 Sets,\r\n \r\n12 Squats,\r\n \r\n25 Minutes Free Running",
    		"40 Push-ups/3 Sets,\r\n\r\n45 Forward Lunge,\r\n \r\n 2 Minute Plank/ 2 Sets,\r\n \r\n12 Squats,\r\n \r\n30 Minutes Free Running",};
   
   
    /** The target calories per day. */
    //instance variables
    double targetCaloriesPerDay;

    /**
     * Instantiates a new diet plan.
     *
     * @param currentTargetCaloriesPerDay the current target calories per day
     */
    //constructor
    public DietPlan (double currentTargetCaloriesPerDay) {
        targetCaloriesPerDay = currentTargetCaloriesPerDay;
    }

    /**
     * Gets the target calories per day.
     *
     * @return the target calories per day
     */
    //methods
    public double getTargetCaloriesPerDay() {
        return targetCaloriesPerDay;
    }
    
    /**
     * Sets the target calories per day.
     *
     * @param newTargetCaloriesPerDay the new target calories per day
     */
    public void setTargetCaloriesPerDay (double newTargetCaloriesPerDay) {
        targetCaloriesPerDay = newTargetCaloriesPerDay;
    }
    
    /**
     * Gets the breakfast suggestion.
     *
     * @return the breakfast suggestion
     */
    public String getBreakfastSuggestion() {
        if (targetCaloriesPerDay <= 1500) {
            return breakfastSuggestion[0];
        }
        else if (targetCaloriesPerDay > 1500 && targetCaloriesPerDay < 2000) {
            return breakfastSuggestion[1];
        }
        else {
            return breakfastSuggestion[2];
        }
    }
    
    /**
     * Gets the lunch suggestion.
     *
     * @return the lunch suggestion
     */
    public String getLunchSuggestion() {
        if (targetCaloriesPerDay <= 1500) {
            return lunchSuggestion[0];
        }
        else if (targetCaloriesPerDay > 1500 && targetCaloriesPerDay < 2000) {
            return lunchSuggestion[1];
        }
        else {
            return lunchSuggestion[2];
        }
    }
    
    /**
     * Gets the dinner suggestion.
     *
     * @return the dinner suggestion
     */
    public String getDinnerSuggestion() {
        if (targetCaloriesPerDay <= 1500) {
            return dinnerSuggestion[0];
        }
        else if (targetCaloriesPerDay > 1500 && targetCaloriesPerDay < 2000) {
            return dinnerSuggestion[1];
        }
        else {
            return dinnerSuggestion[2];
        }
    }
    
    /**
     * Gets the exercise suggestion.
     *
     * @return the exercise suggestion
     */
    public String getExerciseSuggestion() {
    	
        if (targetCaloriesPerDay <= 1500) {
            return exerciseSuggestion[0];
        }
        else if (targetCaloriesPerDay > 1500 && targetCaloriesPerDay < 2000) {
            return exerciseSuggestion[1];
        }
        else {
            return exerciseSuggestion[2];
        }
    }
    	
}