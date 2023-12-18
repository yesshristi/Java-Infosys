 class Loan {
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;
    private static int loanCounter = 0;

    public Loan() {
        loanCounter++;
    }

    public Loan(int accountNo, int customerNo, float loanAmount, int loanDuration, float interest) {
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
        this.interest = interest;
        loanCounter++;
    }

    public int getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(int loanNo) {
        this.loanNo = loanNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public static int getLoanCounter() {
        return loanCounter;
    }
}

public class LoanTester {
    public static void main(String[] args) {
        // Create 2 objects of Loan class using the default constructor
        Loan loan1 = new Loan();
        Loan loan2 = new Loan();

        // Create 2 objects of Loan class using the parameterized constructor
        Loan loan3 = new Loan(12345, 9876, 5000.0f, 12, 5.0f);
        Loan loan4 = new Loan(54321, 6789, 8000.0f, 24, 6.0f);

        // Display loanCounter for each instance
        System.out.println("LoanCounter for loan1: " + Loan.getLoanCounter());
        System.out.println("LoanCounter for loan2: " + Loan.getLoanCounter());
        System.out.println("LoanCounter for loan3: " + Loan.getLoanCounter());
        System.out.println("LoanCounter for loan4: " + Loan.getLoanCounter());
    }
}
