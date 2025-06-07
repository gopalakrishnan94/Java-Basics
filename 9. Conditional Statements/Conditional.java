public class Conditional {
    public static void main(String[] args) {
        int cond1 = 10;
        int cond2 = 20;

        // Using if-else statement
        if (cond1 > cond2) {
            System.out.println("cond1 is greater than cond2");
        } else if (cond1 < cond2) {
            System.out.println("cond1 is less than cond2");
        } else {
            System.out.println("cond1 is equal to cond2");
        }

        // Using switch statement
        int condDay = 3;
        switch (condDay) {
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("Invalid");
        }

        // Using ternary operator
        int max = (cond1 > cond2) ? cond1 : cond2;
        System.out.println("The maximum value is: " + max);

        // Using logical operators
        if (cond1 > 0 && cond2 > 0) {
            System.out.println("Both cond1 and cond2 are positive");
        } else if (cond1 > 0 || cond2 > 0) {
            System.out.println("At least one of cond1 or cond2 is positive");
        } else {
            System.out.println("Neither cond1 nor cond2 is positive");
        }

        // Using nested if-else
        if (cond1 > 0) {
            if (cond2 > 0) {
                System.out.println("Both cond1 and cond2 are positive");
            } else {
                System.out.println("cond1 is positive but cond2 is not");
            }
        } else {
            if (cond2 > 0) {
                System.out.println("cond2 is positive but cond1 is not");
            } else {
                System.out.println("Both cond1 and cond2 are not positive");
            }
        }

        // Using if statement with a single statement block
        if (cond1 > 20)
            System.out.println("cond1 is greater than 20");
        else
            System.out.println("cond1 is not greater than 20");
    }
}