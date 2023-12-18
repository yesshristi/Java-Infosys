public class EmployeeRecord {
    public static void main(String[] args) {
        double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};

        // Calculate average salary
        double totalSalary = 0;
        for (double s : salary) {
            totalSalary += s;
        }
        double averageSalary = totalSalary / salary.length;

        // Count employees above and below average salary
        int aboveAverageCount = 0;
        int belowAverageCount = 0;
        for (double s : salary) {
            if (s > averageSalary) {
                aboveAverageCount++;
            } else if (s < averageSalary) {
                belowAverageCount++;
            }
        }

        // Display results
        System.out.println("The average salary of the employee is: " + averageSalary);
        System.out.println("The number of employees having salary greater than the average is: " + aboveAverageCount);
        System.out.println("The number of employees having salary lesser than the average is: " + belowAverageCount);
    }
}
