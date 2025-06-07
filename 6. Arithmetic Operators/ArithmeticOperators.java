public class ArithmeticOperators {
    public static void main (String args[]) {

        // Arithmetic Operators in Java
        // Arithmetic Operators are used to perform basic mathematical operations like addition, subtraction, multiplication, and division.

        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum); // Output: Sum: 15

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference); // Output: Difference: 5

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product); // Output: Product: 50

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient); // Output: Quotient: 2

        // Modulus (Remainder)
        int remainder = a % b;
        System.out.println("Remainder: " + remainder); // Output: Remainder: 0

        // Increment Operator
        a++; // Incrementing a by 1
        System.out.println("Incremented a: " + a); // Output: Incremented a: 11

        ++a; // Pre-increment: a is incremented before its value is used
        System.out.println("Pre-incremented a: " + a); // Output: Pre-incremented a: 12

        // Post-increment: a is incremented after its value is used
        int postIncrementedA = a++;
        System.out.println("Post-incremented a: " + postIncrementedA); // Output: Post-incremented a: 12
        System.out.println("Value of 'a' after post-increment: " + a); // Output: Value of a after post-increment: 13

        // Decrement Operator
        b--; // Decrementing b by 1
        System.out.println("Decremented b: " + b); // Output: Decremented b: 4

        --b; // Pre-decrement: b is decremented before its value is used
        System.out.println("Pre-decremented b: " + b); // Output: Pre-decremented b: 3

        // Post-decrement: b is decremented after its value is used
        int postDecrementedB = b--;
        System.out.println("Post-decremented b: " + postDecrementedB); // Output: Post-decremented b: 3
        System.out.println("Value of 'b' after post-decrement: " + b); // Output: Value of b after post-decrement: 2

        // Compound Assignment Operators
        a += 5; // Equivalent to a = a + 5
        System.out.println("a after += 5: " + a); // Output: a after += 5: 18

        b *= 2; // Equivalent to b = b * 2
        System.out.println("b after *= 2: " + b); // Output: b after *= 2: 4
    }
}