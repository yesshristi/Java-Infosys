public class Operators {
     public static void main(String[] args) {
    double balance = 2000;
    System.out.println("Amount to withdraw");
    double amount = 500, limit = 10000, minbal = 500;
    if (!(amount < 0)) { // Using NOT
    if (amount <= limit && (balance - amount) > minbal) {
    balance -= amount;
    System.out.println("Withdrawal has succeeded");
    }
    }
    }

    // public static void main(String[] args) {
    // double balance = 600;
    // System.out.println("Amount to withdraw");
    // double amount = 1500;
    // if(amount < 0 || amount > balance) {
    // System.out.println("Withdrawal has failed");
    // }
    // else {
    // balance -= amount;
    // System.out.println("Withdrawal has succeeded");
    // }
    // }

    public static void main(String[] args) {
        double balance = 2000;
        System.out.println("Amount to withdraw");
        double amount = 500, limit = 10000, minbal = 500;
        if (amount <= limit && (balance - amount) > minbal) {
            balance -= amount;
            System.out.println("Withdrawal has succeeded");
        }
    }
}
