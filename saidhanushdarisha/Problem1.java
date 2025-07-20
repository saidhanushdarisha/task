package saidhanushdarisha;

import java.util.Scanner;

public class Problem1 {
    static class Calculator {
        double a, b;

        Calculator(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double operate(String op) {
            switch (op.toLowerCase()) {
                case "add":
                    return a + b;
                case "sub":
                    return a - b;
                case "mul":
                    return a * b;
                case "div":
                    return b != 0 ? a / b : Double.NaN;
                default:
                    System.out.println("Invalid Operation");
                    return Double.NaN;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = sc.next();

        Calculator calc = new Calculator(a, b);
        double result = calc.operate(op);
        System.out.println("Result: " + result);
    }
}
