package css.cis3334.heartratecalculator;

/**
 * Created by tgibbons on 2/10/2017.
 */
public class HeartHealthCalculator {

    public enum exerciseLevels {MODERATE, AVERAGE, VIGOROUS, NO_VALUE}

    /**
     *  constructor initializes values
     */
    public HeartHealthCalculator() {
        age = -999;
        maximumHeartRate = 0;
        exerLevel = exerciseLevels.NO_VALUE;
    }

    private Integer age;
    public void setAge(Integer age) {
        this.age = age;
        maximumHeartRate = 220 - age;        // from  http://www.cdc.gov/physicalactivity/basics/measuring/heartrate.htm
    }
    int maximumHeartRate = 0;           // estimated max heartrate based on age
    private exerciseLevels exerLevel;
    /**
     *  Set the exercise level
     * @param level where 0 = moderate, 1=average, 2=vigorous
     */
    public void setExerciseLevel(Integer level) {
        if (level==0) {
            exerLevel = exerciseLevels.MODERATE;
        } else if (level==1) {
            exerLevel = exerciseLevels.AVERAGE;
        } else if (level==2) {
            exerLevel = exerciseLevels.VIGOROUS;
        } else {
            exerLevel = exerciseLevels.NO_VALUE;
        }
    }


    public Double getLowerHeartRate() {
        if (exerLevel == exerciseLevels.MODERATE) {
            // do calculations for moderate exercise
            lowerHeartRate = 0.5 * maximumHeartRate;   // this is the formula for lower heart rate for moderate exercise
            upperHeartRate = 0.7 * maximumHeartRate;   // this is the formula for upper heart rate for moderate exercise
            System.out.println("The target heart rate for moderate exercise is between " + lowerHeartRate + "  and " + upperHeartRate);
        }
        if (exerLevel == exerciseLevels.AVERAGE) {
            // do calculations for average exercise
            lowerHeartRate = 0.6 * maximumHeartRate;   // this is the formula for lower heart rate for average exercise
            upperHeartRate = 0.8 * maximumHeartRate;   // this is the formula for upper heart rate for average exercise
            System.out.println("The target heart rate for average exercise is between " + lowerHeartRate + "  and " + upperHeartRate);
        }
        if (exerLevel == exerciseLevels.VIGOROUS) {
            // do calculations for vigorous exercise
            lowerHeartRate = 0.7 * maximumHeartRate;   // this is the formula for lower heart rate for vigorous exercise
            upperHeartRate = 0.85 * maximumHeartRate;   // this is the formula for upper heart rate for vigorous exercise
            System.out.println("The target heart rate for vigorous exercise is between " + lowerHeartRate + "  and " + upperHeartRate);
        }

    }
}
