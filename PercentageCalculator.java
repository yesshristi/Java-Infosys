public class PercentageCalculator {
    public static void main(String[] args) {
        Intern intern = new Intern(5000, 500);
        System.out.println("Input (For Intern):");
        System.out.println("Marks Secured: 5000");
        System.out.println("Grace Marks: 500");
        System.out.println("Output:");
        intern.calcPercentage();
        
        System.out.println();

        Trainee trainee = new Trainee(6000);
        System.out.println("Input (For Trainee):");
        System.out.println("Marks Secured: 6000");
        System.out.println("Output:");
        trainee.calcPercentage();

        System.out.println();

        Intern invalidIntern = new Intern(8000, 500);
        System.out.println("Input (For Intern):");
        System.out.println("Marks Secured: 8000");
        System.out.println("Grace Marks: 500");
        System.out.println("Output:");
        invalidIntern.calcPercentage();
    }
}
