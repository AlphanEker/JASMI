package classes;
import java.util.ArrayList;

public class ExercisePlan {
    
    //constants
    final String[] exerciseSuggestion = {"10 Push-ups/2 Sets,\r\n \r\n15 Forward Lunge,\r\n \r\n 1 Minute Plank/3Sets,\r\n \r\n12 Squats,\r\n \r\n15 Minutes Free Running",
    		"25 Push-ups/2 Sets,\r\n\r\n30 Forward Lunge,\r\n \r\n 1.5 Minute Plank/3 Sets,\r\n \r\n12 Squats,\r\n \r\n25 Minutes Free Running",
    		"40 Push-ups/3 Sets,\r\n\r\n45 Forward Lunge,\r\n \r\n 2 Minute Plank/ 2 Sets,\r\n \r\n12 Squats,\r\n \r\n30 Minutes Free Running",};
   
    //instance variables
    double targetCaloriesPerDay;

    //constructor
    public ExercisePlan (double currentTargetCaloriesPerDay) {
        targetCaloriesPerDay = currentTargetCaloriesPerDay;
    }

    //methods
    public double getTargetCaloriesPerDay() {
        return targetCaloriesPerDay;
    }
    
    public void setTargetCaloriesPerDay (double newTargetCaloriesPerDay) {
        targetCaloriesPerDay = newTargetCaloriesPerDay;
    }
    
    public String getBreakfastSuggestion() {
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

    