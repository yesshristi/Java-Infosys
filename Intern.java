public class Intern implements DataProvider {
    int marksSecured;
    int graceMarks;

    public Intern(int marksSecured, int graceMarks) {
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }

    @Override
    public void calcPercentage() {
        double totalMarks = marksSecured + graceMarks;
        double percentage = (totalMarks / DataProvider.totalMaximumMarks) * 100;

        if (totalMarks <= DataProvider.totalMaximumMarks) {
            System.out.println("The total aggregate percentage secured is: " + percentage);
        } else {
            System.out.println("Please enter the correct marks");
        }
    }
}
