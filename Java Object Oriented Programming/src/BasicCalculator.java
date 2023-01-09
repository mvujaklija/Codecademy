/**This is the project of how to use methods on the different ways
 * In this example we use simple methods without void keyword that just return values
 *
 */

//Declaration of class
public class BasicCalculator {

//Declaration of constructor

    public BasicCalculator ( ) {

    }

    //Declaration of methods
    public int add ( int a, int b ) {

        return a + b;

    }
    public int subtract ( int a, int b ) {

        return a - b;

    }
    public int multiply( int a, int b ) {

        return a * b;

    }
    public int divide( int a, int b ) {

        return a / b;

    }
    public int modulo ( int a, int b) {

        return a % b;

    }

//Declaration of main method

    public static void main ( String[] args ) {

        BasicCalculator myCalculator = new BasicCalculator ();

        System.out.println ( "Result of addition of two numbers ( 5 and 7 ) is: " + myCalculator.add ( 5, 7 ) );
        System.out.println ( "Result of subtracting of two numbers ( 45 and 11 ) is: " + myCalculator.subtract ( 45, 11 ) );
        System.out.println ( "Result of multiplication of two numbers ( 12 and 3 ) is: " + myCalculator.multiply ( 12, 3 ) );
        System.out.println ( "Result of division of two numbers ( 40 and 5 ) is: " + myCalculator.divide ( 40, 5 ) );
        System.out.println ( "Result of modulo of two numbers ( 40 and 6 ) is: " + myCalculator.modulo ( 40, 6 ) );

    }

}
