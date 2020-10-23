package task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = reaSequenceElements("Enter 'X' value: ");
        int n = reaSequenceElements("Enter the number of members in the sequence to sum them. n = ");
        int repeat  = calculateNumberRepetitions(n);
        int summa = calculateSumSequence(x, repeat);

        printSum(n, summa);
    }

    public static int reaSequenceElements(String name) {
        Scanner in = new Scanner(System.in);
        System.out.print(name);
        return in.nextInt();
    }

    public static int calculateSumSequence(int x, int repeat) {
        int x0 = x;
        int sum = 0;

        for (int i = 1; i <= repeat; i++) {
            double condition = ((i + 2) * (i + 1)) / 2 * Math.pow(x0, i);
            if (checkCycleNumber(i)) {
                sum = (int) (x + condition);
            } else {
                sum = (int) (x - condition);
            }
            x = sum;
        }
        return sum;
    }

    public static int calculateNumberRepetitions(int n) {
        return n * 2;
    }

    public static boolean checkCycleNumber(int i) {
        return i % 2 != 1;
    }

    public static void printSum(int n, int summa) {
        System.out.print("Sum of the first " + n + " members of the sequence = " + summa);
    }
}
