package saidhanushdarisha;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();

        // Calculate how many odd numbers to print
        int count;
        if (a % 2 == 0) {
            count = a - 1; // If even, print a-1 terms
        } else {
            count = a; // If odd, print a terms
        }

        int currentOdd = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(currentOdd);
            if (i < count) {
                System.out.print(", ");
            }
            currentOdd += 2; // Move to next odd number
        }
    }
}
