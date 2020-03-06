public class CreatingVariables {
    public static void main( String[] args ) {
        int x, y, age, date;
        double seconds, e, checking, saving;
        String firstName, lastName, title, middleName, suffix;

        x = 10;
        y = 400;
        age = 39;
        date = 28;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        saving = 453.4;

        firstName = "Graham";
        lastName = "Mitchell";
        title = "Mr.";
        middleName = "Al";
        suffix = "Junior";

        System.out.println( "The variable x contains " + x );
        System.out.println( "The value " + y + " is stored in the variable y." );
        System.out.println( "The experiment took " + seconds + " seconds." );
        System.out.println( "A favorite irrational # is Euler's number: " + e );
        System.out.println( "Hopefully you have more than $" + checking + "!" );
        System.out.println( "My name's " + title + " " + firstName + lastName );
        System.out.println( "Today is " + date + "  of February." );
        System.out.println( "I have $" + saving + " in my savings" );
        System.out.println( "His name is " + middleName + " " + suffix );

    }
}
