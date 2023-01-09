/**
 * Operators that share the same precedence are evaluated from Left-to-Right within the expression.
 * <p>
 * The order is as follows:
 * <p>
 * Parentheses
 * Exponents
 * Modulo/Multiplication/Division
 * Addition/Subtraction
 */

public class Operations {

    public static void main(String[] args) {

        int expression1 = 5 % 2 - (4 * 2 - 1);
        System.out.println(expression1);

        int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
        System.out.println(expression2);

        int expression3 = 5 * 4 % 3 - 2 + 1;
        System.out.println(expression3);
    }
}
