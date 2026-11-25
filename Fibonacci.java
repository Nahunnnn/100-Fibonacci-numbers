import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ZERO; // F(0)
        BigInteger b = BigInteger.ONE;  // F(1)

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": " + a);
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
    }
}