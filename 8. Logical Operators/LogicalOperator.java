public class LogicalOperator {
    public static void main(String[] args) {
        // Logical AND operator
        boolean a = true;
        boolean b = false;
        boolean resultAnd = a && b; // false
        System.out.println("Logical AND (true && false): " + resultAnd);

        // Logical OR operator
        boolean resultOr = a || b; // true
        System.out.println("Logical OR (true || false): " + resultOr);

        // Logical NOT operator
        boolean resultNotA = !a; // false
        System.out.println("Logical NOT (!true): " + resultNotA);
        
        // Combining logical operators
        boolean combinedResult = (a && b) || (!a && !b); // false
        System.out.println("Combined Result ((true && false) || (!true && !false)): " + combinedResult);

        // Example with non-boolean types
        int x = 5;
        int y = 10;
        boolean resultComparison = (x < y) && (y > 0); // true
        System.out.println("Comparison Result (5 < 10 && 10 > 0): " + resultComparison);

        // Short-circuit evaluation
        boolean shortCircuit = (x > 10) && (++y > 10); // y is not incremented
        System.out.println("Short-circuit evaluation (5 > 10 && ++y > 10): " + shortCircuit);
        System.out.println("Value of y after short-circuit: " + y); // y remains 10
    }
}