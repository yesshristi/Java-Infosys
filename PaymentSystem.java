abstract class RRPaymentServices {
    protected double balance;
    protected int customerID;

    public RRPaymentServices(double balance, int customerID) {
        this.balance = balance;
        this.customerID = customerID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getCustomerID() {
        return customerID;
    }

    abstract void payBill(double amount);
}

class ShoppingPayment extends RRPaymentServices {
    private static int counter = 1001;
    private String paymentID;

    public ShoppingPayment(double balance, int customerID) {
        super(balance, customerID);
    }

    public String getPaymentID() {
        return paymentID;
    }

    @Override
    public void payBill(double amount) {
        if (amount == balance) {
            paymentID = "S" + counter++;
            System.out.println("Congratulations!! You have Successfully made a payment of " + amount +
                    " payment details are --");
            System.out.println("Customer ID : " + customerID);
            System.out.println("Payment ID : " + paymentID);
            System.out.println("Previous Due : " + balance);
            System.out.println("Remaining Due : " + 0.0);
            System.out.println("CashBack Wallet Balance : " + 0.0);
        } else {
            System.out.println("Insufficient amount entered!! Please try again.");
        }
    }
}

class CreditCardPayment extends RRPaymentServices {
    private static int counter = 2001;
    private String paymentID;
    private double cashBack;
    private double balanceDue;

    public CreditCardPayment(double balance, int customerID) {
        super(balance, customerID);
    }

    public String getPaymentID() {
        return paymentID;
    }

    public double getCashBack() {
        return cashBack;
    }

    public double getBalanceDue() {
        return balanceDue;
    }

    @Override
    public void payBill(double amount) {
        if (amount > balance) {
            cashBack = amount - balance;
            balanceDue = 0.0;
            paymentID = "C" + counter++;
            System.out.println("Congratulations!! You have successfully made a payment of Rs." + amount +
                    " Payment Details are-");
            System.out.println("Customer ID : " + customerID);
            System.out.println("Payment ID : " + paymentID);
            System.out.println("Previous Due : Rs." + balance);
            System.out.println("Remaining Due : Rs." + balanceDue);
            System.out.println("CashBack wallet Balance : Rs." + cashBack);
        } else if (amount == balance) {
            balanceDue = 0.0;
            paymentID = "C" + counter++;
            System.out.println("Congratulations!! You have successfully made a payment of Rs." + amount +
                    " Payment Details are-");
            System.out.println("Customer ID : " + customerID);
            System.out.println("Payment ID : " + paymentID);
            System.out.println("Previous Due : Rs." + balance);
            System.out.println("Remaining Due : Rs." + balanceDue);
            System.out.println("CashBack wallet Balance : Rs." + cashBack);
        } else {
            balanceDue = balance - amount;
            paymentID = "C" + counter++;
            System.out.println("Congratulations!! You have successfully made a payment of Rs." + amount +
                    " Payment Details are-");
            System.out.println("Customer ID : " + customerID);
            System.out.println("Payment ID : " + paymentID);
            System.out.println("Previous Due : Rs." + balance);
            System.out.println("Remaining Due : Rs." + balanceDue);
            System.out.println("CashBack wallet Balance : Rs." + cashBack);
        }
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        CreditCardPayment ccPayment = new CreditCardPayment(10000.23, 5001);
        ccPayment.payBill(15000.0);

        ShoppingPayment shoppingPayment = new ShoppingPayment(10000.23, 50001);
        shoppingPayment.payBill(15000.0);
    }
}
