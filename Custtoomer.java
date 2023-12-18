interface IBankNew{
    boolean applyforCreditCard(Custtoomer customer);
}

interface IBank extends IBankNew{
    int CAUTION_MONEY = 2000;
    String createAccount(Custtoomer customer);
    double issueVehicleLoan(String vehicleType, Custtoomer customer);
    double issueHouseLoan(Custtoomer customer);
    double issueGoldLoan(Custtoomer customer);
}

class Custtoomer {
    private String name;
    private String customerId;
        
    public String getName() {
        return name;
    }
        
    public void setName(String name) {
        this.name=name;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId= customerId;
    }
}

class MumbaiBranch implements IBank {
    public String createAccount(Custtoomer customer){
        return "Acc12345";
    }
    public double issueVehicleLoan(String vehicleType,Custtoomer customer){ 
        if(vehicleType.equals("bike")) {
            return 100000;
        }
        else {
            return 500000;
        }
    }
    public double issueHouseLoan(Custtoomer customer){
        return 200000;
    }
    public double issueGoldLoan(Custtoomer customer){
        return 500000;
    }
    public boolean applyforCreditCard(Custtoomer customer){
        return true;
    }
}

class Execute{
    public static void main(String[] args){
        IBank bank=new MumbaiBranch();  
        Custtoomer customer = new Custtoomer();
        customer.setCustomerId("cust1001");
        customer.setName("Ajay");
        String accountNumber = bank.createAccount(customer);
        System.out.println("Account number is..." +accountNumber);
        double gloan = bank.issueGoldLoan(customer);
        System.out.println("Gold loan amount is..." +gloan);
        double hloan = bank.issueHouseLoan(customer);
        System.out.println("House loan amount is..." +hloan);
        double vloan = bank.issueVehicleLoan("bike", customer);
        System.out.println("Vehicle loan amount is..." +vloan);
        System.out.println("Caution money is..." +IBank.CAUTION_MONEY);
        IBankNew bank1 = new MumbaiBranch();
        boolean credit = bank1.applyforCreditCard(customer);
        System.out.println("Credit card request.." + credit);
    }
}
