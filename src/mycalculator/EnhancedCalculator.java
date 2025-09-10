package mycalculator;

import java.util.Scanner;

public class EnhancedCalculator {

    // Arithmetic Methods
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error! Cannot divide by zero.");
            return Double.NaN; // Return NaN if divided by zero
        }
        return num1 / num2;
    }

    // Scientific Methods
    public static double sin(double angle) {
        return Math.sin(angle); // angle in radians
    }

    public static double cos(double angle) {
        return Math.cos(angle); // angle in radians
    }

    public static double tan(double angle) {
        return Math.tan(angle); // angle in radians
    }

    public static double log(double number) {
        if (number <= 0) {
            System.out.println("Error! Logarithm undefined for non-positive numbers.");
            return Double.NaN;
        }
        return Math.log(number); // Natural logarithm (base e)
    }

    public static double sqrt(double number) {
        if (number < 0) {
            System.out.println("Error! Square root undefined for negative numbers.");
            return Double.NaN;
        }
        return Math.sqrt(number);
    }

    // Unit Conversion Methods
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double metersToKilometers(double meters) {
        return meters / 1000;
    }

    public static double kilometersToMeters(double kilometers) {
        return kilometers * 1000;
    }

    public static double centimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }

    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Main menu
            System.out.println("\n=== Enhanced Calculator ===");
            System.out.println("1. Basic Arithmetic");
            System.out.println("2. Scientific Functions");
            System.out.println("3. Unit Conversions");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            
            // Input validation for menu choice
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Ask for operation choice
                    System.out.println("\nChoose an operation:");
                    System.out.println("1. Add");
                    System.out.println("2. Subtract");
                    System.out.println("3. Multiply");
                    System.out.println("4. Divide");
                    System.out.print("Enter your choice: ");
                    int operation = scanner.nextInt();

                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    
                    double result = 0.0;

                    // Perform the selected operation
                    switch (operation) {
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
                        default:
                            System.out.println("Invalid operation choice.");
                            continue;
                    }

                    // Display result
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    // Scientific functions
                    System.out.println("\nChoose a scientific function:");
                    System.out.println("1. Sine (sin)");
                    System.out.println("2. Cosine (cos)");
                    System.out.println("3. Tangent (tan)");
                    System.out.println("4. Logarithm (log)");
                    System.out.println("5. Square Root (sqrt)");
                    System.out.print("Enter your choice: ");
                    int scientificChoice = scanner.nextInt();

                    double inputNumber;
                    double scientificResult = 0.0;

                    switch (scientificChoice) {
                        case 1:
                            System.out.print("Enter angle (in radians): ");
                            inputNumber = scanner.nextDouble();
                            scientificResult = sin(inputNumber);
                            break;
                        case 2:
                            System.out.print("Enter angle (in radians): ");
                            inputNumber = scanner.nextDouble();
                            scientificResult = cos(inputNumber);
                            break;
                        case 3:
                            System.out.print("Enter angle (in radians): ");
                            inputNumber = scanner.nextDouble();
                            scientificResult = tan(inputNumber);
                            break;
                        case 4:
                            System.out.print("Enter number: ");
                            inputNumber = scanner.nextDouble();
                            scientificResult = log(inputNumber);
                            break;
                        case 5:
                            System.out.print("Enter number: ");
                            inputNumber = scanner.nextDouble();
                            scientificResult = sqrt(inputNumber);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            continue;
                    }

                    // Display scientific result
                    System.out.println("Result: " + scientificResult);
                    break;

                case 3:
                    System.out.println("\nChoose a conversion type:");
                    System.out.println("1. Temperature Conversion");
                    System.out.println("2. Length Conversion");
                    System.out.print("Enter your choice: ");
                    int conversionChoice = scanner.nextInt();

                    double conversionInput;
                    double conversionResult;

                    switch (conversionChoice) {
                        case 1:
                            System.out.println("\nChoose conversion direction:");
                            System.out.println("1. Celsius to Fahrenheit");
                            System.out.println("2. Fahrenheit to Celsius");
                            System.out.print("Enter your choice: ");
                            int tempChoice = scanner.nextInt();

                            switch (tempChoice) {
                                case 1:
                                    System.out.print("Enter temperature in Celsius: ");
                                    conversionInput = scanner.nextDouble();
                                    conversionResult = celsiusToFahrenheit(conversionInput);
                                    System.out.println(conversionInput + " Celsius = " + conversionResult + " Fahrenheit");
                                    break;
                                case 2:
                                    System.out.print("Enter temperature in Fahrenheit: ");
                                    conversionInput = scanner.nextDouble();
                                    conversionResult = fahrenheitToCelsius(conversionInput);
                                    System.out.println(conversionInput + " Fahrenheit = " + conversionResult + " Celsius");
                                    break;
                                default:
                                    System.out.println("Invalid choice.");
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("\nChoose conversion direction:");
                            System.out.println("1. Meters to Kilometers");
                            System.out.println("2. Kilometers to Meters");
                            System.out.println("3. Centimeters to Inches");
                            System.out.println("4. Inches to Centimeters");
                            System.out.print("Enter your choice: ");
                            int lengthChoice = scanner.nextInt();

                            switch (lengthChoice) {
                                case 1:
                                    System.out.print("Enter length in meters: ");
                                    conversionInput = scanner.nextDouble();
                                    conversionResult = metersToKilometers(conversionInput);
                                    System.out.println(conversionInput + " meters = " + conversionResult + " kilometers");
                                    break;
                                case 2:
                                    System.out.print("Enter length in kilometers: ");
                                    conversionInput = scanner.nextDouble();
                                    conversionResult = kilometersToMeters(conversionInput);
                                    System.out.println(conversionInput + " kilometers = " + conversionResult + " meters");
                                    break;
                                case 3:
                                    System.out.print("Enter length in centimeters: ");
                                    conversionInput = scanner.nextDouble();
                                    conversionResult = centimetersToInches(conversionInput);
                                    System.out.println(conversionInput + " centimeters = " + conversionResult + " inches");
                                    break;
                                case 4:
                                    System.out.print("Enter length in inches: ");
                                    conversionInput = scanner.nextDouble();
                                    conversionResult = inchesToCentimeters(conversionInput);
                                    System.out.println(conversionInput + " inches = " + conversionResult + " centimeters");
                                    break;
                                default:
                                    System.out.println("Invalid choice.");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    break;

                case 0:
                    System.out.println("Exiting calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}