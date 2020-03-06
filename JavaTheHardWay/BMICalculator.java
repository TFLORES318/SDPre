import java.util.Scanner;

public class BMICalculator {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double lbs, feet, inches, total, m, kg, bmi, x, y, z;

        x = 2.2046;
        y = 0.0254;
        z = 12;

        System.out.print( "Your height (feet only): " );
        feet = keyboard.nextDouble();

        System.out.print( "Your height (inches only): ");
        inches = keyboard.nextDouble();

        System.out.print( "Your weight in lbs: " );
        lbs = keyboard.nextDouble();

        total = feet*z;
        kg = lbs / x;
        m = ((inches+total)*y);
        bmi = kg / (m*m);

        System.out.println( "Your BMI is " + bmi );
    }
}
