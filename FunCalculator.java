public class FunCalculator {
    public static void main(String[] args) {
        int choice = 1; // Set the initial choice as 1 or 2 to switch between the options

        int number = 153; // Input number for Armstrong calculation
        int number2 = 1623; // Input number for Lucky number calculation

        switch (choice) {
            case 1:
                System.out.println("1. Calculate Armstrong");
                System.out.println("2. Calculate Lucky Number");
                System.out.println("Your choice is " + choice);
                if (isArmstrong(number)) {
                    System.out.println("The number " + number + " is an Armstrong number");
                } else {
                    System.out.println("The number " + number + " is not an Armstrong number");
                }
                break;
            case 2:
                System.out.println("1. Calculate Armstrong");
                System.out.println("2. Calculate Lucky Number");
                System.out.println("Your choice is " + choice);
                if (isLucky(number2)) {
                    System.out.println("The number " + number2 + " is a lucky number!");
                } else {
                    System.out.println("The number " + number2 + " is not a lucky number!");
                }
                break;
            default:
                System.out.println("1. Calculate Armstrong");
                System.out.println("2. Calculate Lucky Number");
                System.out.println("Oops! Invalid choice!");
        }
    }

    // Method to check for Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        return result == number;
    }

    // Method to check for Lucky number
    public static boolean isLucky(int number) {
        int sum = 0;
        boolean alternate = false;

        while (number > 0) {
            int digit = number % 10;
            if (alternate) {
                sum += digit * digit;
            }
            alternate = !alternate;
            number /= 10;
        }

        return sum % 9 == 0;
    }
}
