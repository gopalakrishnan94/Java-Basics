public class RelationalOperator {
    public static void main(String[] args) {

        int rel1 = 10;
        int rel2 = 20;

        // Using relational operators
        System.out.println("rel1 == rel2: " + (rel1 == rel2)); // false
        System.out.println("rel1 != rel2: " + (rel1 != rel2)); // true
        System.out.println("rel1 > rel2: " + (rel1 > rel2));   // false
        System.out.println("rel1 < rel2: " + (rel1 < rel2));   // true
        System.out.println("rel1 >= rel2: " + (rel1 >= rel2)); // false
        System.out.println("rel1 <= rel2: " + (rel1 <= rel2)); // true

        int rel11 = 30;
        int rel12 = 30;

        // Using relational operators with equal values
        System.out.println("rel11 == rel12: " + (rel11 == rel12)); // true
        System.out.println("rel11 != rel12: " + (rel11 != rel12)); // false
        System.out.println("rel11 > rel12: " + (rel11 > rel12));   // false
        System.out.println("rel11 < rel12: " + (rel11 < rel12));   // false
        System.out.println("rel11 >= rel12: " + (rel11 >= rel12)); // true
        System.out.println("rel11 <= rel12: " + (rel11 <= rel12)); // true

    }
}