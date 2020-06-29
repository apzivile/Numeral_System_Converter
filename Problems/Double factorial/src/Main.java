import java.math.BigInteger;
import java.util.Scanner;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        BigInteger bigInteger = BigInteger.ONE;
        int value = 0;
        int result;
        while (n - value > 0) {
            result = n - value;
            value += 2;
            bigInteger = bigInteger.multiply(BigInteger.valueOf(result));
        }
        return bigInteger;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(calcDoubleFactorial(number));
    }
}