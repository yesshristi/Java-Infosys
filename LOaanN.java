public class LOaanN {
    public int loanNo;
    public int accountNo;
    public int customerNo;
    public float loanAmount;
    public int loanDuration;
    public float interest;
    private static int loanCounter;

    static {
        loanCounter = 101;
    }

    public LOaanN() {
        loanCounter++;
    }

    public LOaanN(int accountNo, int customerNo, float loanAmount, int loanDuration, float interest) {
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
        this.interest = interest;
    }

    // Getter and setter methods remain unchanged

    public static int getLoanCounter() {
        return loanCounter;
    }
}

class LTester {
    public static void main(String[] args) {
        LOaanN loan = null;
        loan = new LOaanN();
        System.out.println("LoanCounter after default constructor: " + LOaanN.getLoanCounter());

        loan = new LOaanN(134, 145633, 12.0f, 3, 3.5f);
        System.out.println("LoanCounter after parameterized constructor: " + LOaanN.getLoanCounter());
    }
}
