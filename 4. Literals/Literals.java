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

        boolean f = true; // boolean literal
        System.out.println(f);

        // Floating point literals
        float g = 3.14f; // float literal (must end with 'f' or 'F')
        System.out.println(g);

        double h = 3.14159; // double literal (default type for floating point numbers)
        System.out.println(h);

        // Scientific notation
        double i = 1.23e4; // 1.23 * 10^4
        System.out.println(i);

        // Underscores in numeric literals for readability
        long j = 1_000_000L; // long literal with underscores
        System.out.println(j);

        // Unicode character literal
        char unicodeChar = '\u03A9'; // Greek capital letter Omega
        System.out.println(unicodeChar);

        // String with escape sequences
        String escapedString = "Hello\nWorld"; // New line escape sequence
        System.out.println(escapedString);

        // String with special characters
        String specialString = "Hello\tWorld"; // Tab escape sequence
        System.out.println(specialString);

        // String with quotes
        String quotedString = "She said, \"Hello!\""; // Using backslash to escape quotes
        System.out.println(quotedString);

    }
}