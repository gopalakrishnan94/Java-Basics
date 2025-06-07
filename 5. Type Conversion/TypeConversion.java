public class TypeConversion {
    public static void main (String args[]) {

        // Type Conversion in Java
        // Type Conversion is the process of converting a value from one data type to another.

        // There are two types of type conversion in Java:

        // 1. Implicit Type Conversion (Widening Conversion)
        // 2. Explicit Type Conversion (Narrowing Conversion)

        // Implicit Type Conversion (Widening Conversion)
        // In Implicit Type Conversion, the compiler automatically converts a smaller data type to a larger data type.
        // This is also known as Widening Conversion.
        
        // Example:

        int x = 10; // int is a 32-bit data type
        long y = x; // long is a 64-bit data type, so the int value is automatically converted to long
        System.out.println(y); // Output: 10
        
        double z = y; // double is a 64-bit data type, so the long value is automatically converted to double
        System.out.println(z); // Output: 10.0

        // Explicit Type Conversion (Narrowing Conversion)
        // In Explicit Type Conversion, the programmer explicitly converts a larger data type to a smaller data type.
        // This is also known as Narrowing Conversion.
        
        // Example:
        
        double a = 10.5; // double is a 64-bit data type
        int b = (int) a; // int is a 32-bit data type, so the double value is explicitly converted to int
        System.out.println(b); // Output: 10
        
        long c = 100000L; // long is a 64-bit data type
        int d = (int) c; // int is a 32-bit data type, so the long value is explicitly converted to int
        System.out.println(d); // Output: 100000
        
        // Note: When converting from a larger data type to a smaller data type, there is a risk of data loss.
        // For example, if you try to convert a double value that is larger than the maximum value of an int,
        // you will lose the fractional part and may also lose the integer part if it exceeds the range of int.

        // Example of Type Casting
        // Type Casting is the process of converting a value from one data type to another data type.
        int e = 5;
        byte f = (byte) e; // Type Casting to byte 
        System.out.println(f); // Output : 5

        int g = 258; 
        byte h = (byte) g; // While casting it will be Out of Bounds (more than 256)
        System.out.println(h); // Output : 2 (Dividing by 256 and taking Reminder after Casting)

        float i = 5.62f;
        int j = (int) i; // Type Cast to integer
        System.out.println(j); // Output : 5

        // Type Promotion

        byte k = 10;
        byte l = 30;

        int m = k * l; // Type Promotion from byte to int
        System.out.println(m); // Output : 300
    }
}