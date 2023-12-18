class Employee {
    private int point;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}

class PerformanceRating {
    private static final int Outstanding = 5;
    private static final int Good = 4;
    private static final int Average = 3;
    private static final int Poor = 2;

    public static int calculatePerformance(Employee employee) {
        int point = employee.getPoint();

        if (point >= 80 && point <= 100) {
            return Outstanding;
        } else if (point >= 60 && point <= 79) {
            return Good;
        } else if (point >= 50 && point <= 59) {
            return Average;
        } else if (point >= 1 && point <= 49) {
            return Poor;
        } else {
            return -1; // Invalid point
        }
    }
}

public class PerformanceCalculator {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setPoint(85);

        Employee employee2 = new Employee();
        employee2.setPoint(55);

        Employee employee3 = new Employee();
        employee3.setPoint(75);

        System.out.println("Employee 1 Rating: " + PerformanceRating.calculatePerformance(employee1));
        System.out.println("Employee 2 Rating: " + PerformanceRating.calculatePerformance(employee2));
        System.out.println("Employee 3 Rating: " + PerformanceRating.calculatePerformance(employee3));
    }
}
