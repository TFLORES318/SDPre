public class ThereAndBackAgain {
    public static void main( String[] args ) {
        System.out.println( "Here" );
        erebor();
        System.out.println( "Back first time." );
        // erebor();
        System.out.println( "Back second time." );
    }

    public static void erebor() {
        System.out.println( "There." );
    }
}

//Study Drills
// 1. Removing the () from line 4 does not allow program to compile.
// 2. The output will be different as it will only display one "There."
