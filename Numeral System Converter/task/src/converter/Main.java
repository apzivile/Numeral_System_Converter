package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sourceRadix = sc.nextInt();
        String numInString = sc.next();
        int targetRadix = sc.nextInt();

        long num;
        if (sourceRadix == 1) {
            num = numInString.length();
        } else {
            num = Long.parseLong(numInString, sourceRadix);
        }

        if (targetRadix == 1) {
            for (int i = 0; i < num; i++) {
                System.out.print(1);
            }
        } else {
            String numTarget = Long.toString(num, targetRadix);
            System.out.print(numTarget);
        }
    }
}
