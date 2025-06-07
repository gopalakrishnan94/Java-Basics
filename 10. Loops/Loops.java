public class Loops {
    public static void main(String[] args) {

        // For loop:-
        // If you know how many iterations you want to go for loop
        // (intiliazing vaue, condition, increment or decrement)

        // While loop:-
        // When you need to read the file go for while loop, if the number of iterations is not known.

        // - For loop can also be used as a while.

        // Do While Loop:-
        // If you condition get false but you want to exceute the code at least once.

        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // While loop
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }

        // Do-while loop
        int k = 5;
        do {
            System.out.println("Do-while loop iteration: " + k);
            System.out.println("'Do' will always execute at least once.");
            k++;
        } while (k < 5);

        // Enhanced for loop (for-each)
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Nested loops
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 2; n++) {
                System.out.println("Nested loop iteration: " + m + ", " + n);
            }
        }

        // Break statement
        for (int p = 0; p < 5; p++) {
            if (p == 3) {
                System.out.println("Breaking at iteration: " + p);
                break; // Exit the loop when p equals 3
            }
            System.out.println("Loop iteration before break: " + p);
        }

        // Continue statement
        for (int q = 0; q < 5; q++) {
            if (q == 2) {
                System.out.println("Continuing at iteration: " + q);
                continue; // Skip the rest of the loop when q equals 2
            }
            System.out.println("Loop iteration after continue: " + q);
        }
    }
}