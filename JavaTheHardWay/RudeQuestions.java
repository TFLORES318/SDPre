import java.util.Scanner;

public class RudeQuestions {
    public static void main( String[] args ) {
        String name, initial;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Hello. What is your name? " );
        name = keyboard.next();

        System.out.print( "Hi, " + name + "! How old are you? " );
        age = keyboard.nextInt();

        System.out.println( "So you're " + age + ", eh? That's not very old." );
        System.out.print( "How much do you weigh, " + name +  " ?" );
        weight = keyboard.nextDouble();

        System.out.println( weight + "! Better keep that quiet!!" );
        System.out.print("Finally, what's your income, " + name +  "? " );
        income = keyboard.nextDouble();

        System.out.print( "Hopefully that is " + income + " per hour" );
        System.out.println( " and not per year!" );
        System.out.print( "Well, thanks for answering my rude questions, " );
        System.out.println( name + "." );

        System.out.print( "One more question " + name + ", What's your first name first initial?");
        initial = keyboard.next();
        System.out.println(  initial + ", I thought so!" );
        /* Program does not blow up when entering an integer when expecting a double - I entered 128
        and it carries a decimal .0 over - it always adds .0 to integer /*
        /* Program does not blow up when entering a numeric value when expecting a string - I entered 92.3 and this works. */
        /* I couldn't find any combination that blew up the program for the string questions.
        For the int question, a decimal number blew this up
        For the double questions, letters blew this up */
    }
}
