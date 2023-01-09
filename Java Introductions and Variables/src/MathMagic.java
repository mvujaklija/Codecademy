import java.util.Scanner;

/** Purpos of this project is to what ever integer you input result always will be 3*/


public class MathMagic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input any integer that is less than 42500 and you will see the magic. \n What ever integer you input output will be 3 ");

        //This is starting number

        int myNumber = scanner.nextInt();

        int stepOne = myNumber * myNumber;

        int stepTwo = stepOne + myNumber;

        int stepThree = stepTwo / myNumber;

        int stepFour = stepThree + 17;

        int stepFive = stepFour - myNumber;

        int stepSix = stepFive / 6;

        System.out.println("This is the magic" + " you input number by yours choice and output is 3");
        System.out.println("Result of calculation is: " + stepSix);
        System.out.println("Do you want to try again?");


    }
}

