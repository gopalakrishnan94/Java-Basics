public class DataTypes {
    public static void main (String args[]) {
        byte a = 5; // (-2^7 to (2^7 - 1)) i.e -> (-128 to 127)
        short b = 129; // (-2^15 to (2^15 - 1))
        int c = 1234567; // (-2^31 to (2^31 - 1))
        long d = 1234567890; // (-2^63 to (2^63 - 1))
        long result = a + b + c + d;  

        System.out.println(result);

        float e = 5.6f;
        double f = 2.345678;
        double result1 = e + f;  

        System.out.println(result1);

        char g = 'G';
        boolean h = true;

        System.out.println(g);
        System.out.println(h);
    }
}