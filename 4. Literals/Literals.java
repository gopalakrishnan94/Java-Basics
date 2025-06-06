public class Literals {
    public static void main (String args[]) {
        
        // All the variables are Literals (int,float,char,boolean etc.,.)
        // On top of variables, binary vaues, hexa decimal values etc also supported

        int a = 0b101; // binary value
        System.out.println(a);

        int b = 0x7E; // Hexa Decimal Value
        System.out.println(b);

        int c = 10_00_00_000; // For Developer readability how many zeros
        System.out.println(c);

        char d = 'a'; // character variable we can increment
        d++; 
        System.out.println(d);

        String e = "Hello World"; // String literal
        System.out.println(e);

    }
}