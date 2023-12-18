package Infosys_JavaProgrammingFundaments.customer.typeOfCustomer;

import java.lang.*;

public class cuusstomer {
    public int customerId;
    public String name;
    public String address;
    public long[] phoneNo;
    public int billId;
    public String modeOfPayment;
    public int processingCharge;
    public String typeOfCustomer;
    public int discount;

    public cuusstomer() {
        billId = 5001;
        customerId = 1001;
        name = "John";
        address = "No.333,ABC street," +
                "Mysore," +
                "Karnataka," +
                "57001";
        phoneNo = new long[]{996543346, 134646133, 354676646};
    }

    public cuusstomer(String modeOfPayment, int processingCharge, String typeOfCustomer) {
        this.modeOfPayment = modeOfPayment;
        this.processingCharge = processingCharge;
        this.typeOfCustomer = typeOfCustomer;
        typeCheck();
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void typeCheck() {
        if (getTypeOfCustomer().equals("Regular"))
            discount = 10;
        else if (getTypeOfCustomer().equals("Privileged"))
            discount = 20;
        else
            discount = 0;
    }

    public int finalAmount() {
        int amount = 1500;
        return amount + processingCharge - discount;
    }
}
