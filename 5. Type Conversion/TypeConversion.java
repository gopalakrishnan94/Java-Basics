public class TypeConversion {
    public static void main (String args[]) {

        // Type Cating or Type Conversion or Explicit Casting 

        int a = 5;
        byte b = (byte) a; // Type Casting to byte 
        System.out.println(b); // Output : 5

        int c = 258; 
        byte d = (byte) c; // While casting it will be Out of Bounds (more than 256)
        System.out.println(d); // Output : 2 (Dividing by 256 and taking Reminder after Casting)

        float e = 5.62f;
        int f = (int) e; // Type Cast to integer
        System.out.println(f); // Output : 5

        // Type Promotion

        byte g = 10;
        byte h = 30;

        int i = g * h; // Type Promotion from byte to int
        System.out.println(i); // Output : 300
    }
}