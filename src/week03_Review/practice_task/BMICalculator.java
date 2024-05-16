package week03_Review.practice_task;

public class BMICalculator {


    public static void main(String[] args) {

        double height = 1.75,
                weight = 78.5;

        if (height <= 0 && weight <= 0) { // if both height and weight are invalid
            System.err.println("Height and weight can not be negative or zero");
            System.exit(1);  // terminates the entire program
        }

        if (height <= 0) { // if only the height is invalid
            System.err.println("Height can not be negative or zero");
            System.exit(1);  // terminates the entire program
        }

        if (weight <= 0) { //// if only the weight is invalid
            System.err.println("Weight can not be negative or zero");
            System.exit(1);
        }

        double bmi = weight / (height * height);
        String bmiCategory;

        if (bmi < 18.5) { //  false ===> bmi >= 18.5
            bmiCategory = "Underweight";
        } else if (bmi < 25) {  // false ===> bmi >= 25
            bmiCategory = "Normal Weight";
        } else if (bmi < 30) { // false ===> bmi >= 30
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obesity";
        }


        System.out.println("Your Body Mass Index (BMI): " + bmi);
        System.out.println("Category: " + bmiCategory);

        switch (bmiCategory) {
            case "Overweight":
                System.out.println("Suggestion: Stick to the diet");
                break;

            case "Obesity":
                System.out.println("Suggestion: Stick to the diet and engage in more exercise");

        }

    }

    }
