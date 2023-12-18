public class DiscountCalculator {
    public static void main(String[] args) {
        // Input details for the first bill
        int billId1 = 1001;
        int customerId1 = 101;
        double discount1 = 2; // in percentage
        double billAmount1 = 199.99;

        // Calculate the discounted bill amount for the first bill
        double discountedBillAmount1 = calculateDiscountedBillAmount(billAmount1, discount1);

        // Print details and the discounted bill amount for the first bill
        System.out.println("Bill ID: " + billId1);
        System.out.println("Customer ID: " + customerId1);
        System.out.println("Discounted Bill Amount: " + discountedBillAmount1);

        // Input details for the second bill
        int billId2 = 1002;
        int customerId2 = 102;
        double discount2 = 4; // in percentage
        double billAmount2 = 210.5;

        // Calculate the discounted bill amount for the second bill
        double discountedBillAmount2 = calculateDiscountedBillAmount(billAmount2, discount2);

        // Print details and the discounted bill amount for the second bill
        System.out.println("\nBill ID: " + billId2);
        System.out.println("Customer ID: " + customerId2);
        System.out.println("Discounted Bill Amount: " + discountedBillAmount2);
    }

    // Method to calculate discounted bill amount
    public static double calculateDiscountedBillAmount(double billAmount, double discount) {
        return billAmount - (billAmount * (discount / 100));
    }
}
