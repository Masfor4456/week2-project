/**
 * Mason Ford
 * Date: 03/15/2026
 * Assignment: Calculator Project - Phase 2
 * Description: A simple menu-driven calculator that performs
 * addition, subtraction, multiplication, and division.
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        printHeader();
        printInstructions();

        do {

            printMenu();
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            if(choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();

                double result = 0;

                switch(choice) {

                    case 1:
                        result = add(num1, num2);
                        break;

                    case 2:
                        result = subtract(num1, num2);
                        break;

                    case 3:
                        result = multiply(num1, num2);
                        break;

                    case 4:
                        result = divide(num1, num2);
                        break;
                }

                System.out.println("Result: " + result);
            }

        } while(choice != 5);

        System.out.println("\nThank you for using the calculator!");

        input.close();
    }

    public static void printHeader() {
        System.out.println("Project Week 2 - Calculator");
        System.out.println("Student: Mason Ford");
        System.out.println("---------------------------");
    }

    public static void printInstructions() {
        System.out.println("This calculator performs basic math operations.");
        System.out.println("Choose an option from the menu and enter numbers.");
    }

    public static void printMenu() {
        System.out.println("\nCalculator Menu");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Quit");
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if(b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
}