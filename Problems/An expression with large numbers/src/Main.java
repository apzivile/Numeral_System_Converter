import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String[] parts = scanner.nextLine().split("\\s+");
        BigInteger result = null;
        BigInteger num1 = null;
        BigInteger num2 = null;
        BigInteger num3 = null;
        BigInteger num4 = null;

        try {
            num1 = new BigInteger(parts[0]);
            num2 = new BigInteger(parts[1]);
            num3 = new BigInteger(parts[2]);
            num4 = new BigInteger(parts[3]);
            result = num1.negate().multiply(num2).add(num3).subtract(num4);
        } catch (Exception e) {
            System.out.println("Can't parse a big integer value");
            e.printStackTrace();
        }

        System.out.println(result);
    }
}