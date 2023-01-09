/**In this project we are going to use methods that use key word void
 * The object Droid will have his state and his behaviour
 * Instances give objet a state, and a methods give behaviour
 */

public class BuildADroid {

//Declaring the instances

    double batteryLevel;
    String name;

//Declaring the constructor

    public  BuildADroid ( String droidName ) {

        name = droidName;
        batteryLevel = 100;
    }

//Declaring of methods

    //String toString

    public String toString (  ) {

        return "Hello there!!! I am a droid and my name is: " + name ;

    }

    //Behaviour

    //Method for the task

    public void performTask( String task ) {

        System.out.println ( name + " is performing task: " + task );

    }

    //Method for new battery level

    public void  energyReport( ) {

        batteryLevel = batteryLevel - 42.8;

        System.out.println ( name + " battery level after dancing is: " + batteryLevel + " %");

    }

    //Another method for the task

    public void performTask2( String task2 ) {

        System.out.println ( name + " is now performing task after dancing: " + task2 );

    }

    //method after charging battery

    public void energyReport2( ) {

        batteryLevel = 100 ;

        System.out.println ( name + " battery level after charging the battery is: " + batteryLevel + " %" );

    }

//Declaring of main method

    public static void main ( String[] args ) {

        BuildADroid name = new BuildADroid ( "Codey" );

        //Calling of method String toString
        System.out.println ( name );
        //Calling of initial battery level
        System.out.println ( "My current battery status is: " + name.batteryLevel + " %" );
        //Calling a method to perform some task
        name.performTask ( "Dancing like maniac" );
        //Calling the method for energy report after the task
        name.energyReport ();
        //Calling the method to performe other task
        name.performTask2 ( "Charging battery!" );
        //Calling the method for energy report after the task2
        name.energyReport2 ();

    }

}