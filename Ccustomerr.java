interface IBank {
    int CAUTION_MONEY = 2000;
    String createAccount(Ccustomerr ccustomerr);
    double issueVehicleLoan(String vehicleType, Ccustomerr ccustomerr);
    double issueHouseLoan(Ccustomerr ccustomerr);
    double issueGoldLoan(Ccustomerr ccustomerr);
}

class Ccustomerr {
    private String name;
    private String customerId;
        
    public String getName() {
        return name;
    }
        
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}

class MumbaiBranch implements IBank {
    public String createAccount(Ccustomerr ccustomerr){
        return "Acc12345";
    }
    
    public double issueVehicleLoan(String vehicleType, Ccustomerr ccustomerr){ 
        if(vehicleType.equals("bike")) {
            return 100000;
        }
        else {
            return 500000;
        }
    }
    
    public double issueHouseLoan(Ccustomerr ccustomerr){
        return 200000;
    }
    
    public double issueGoldLoan(Ccustomerr ccustomerr){
        return 500000;
    }
}

class Execute{
    public static void main(String[] args){
        IBank bank = new MumbaiBranch();  
        Ccustomerr ccustomerr = new Ccustomerr();
        ccustomerr.setCustomerId("cust1001");
        ccustomerr.setName("Ajay");
        String accountNumber = bank.createAccount(ccustomerr);
        System.out.println("Account number is..." + accountNumber);
        double gloan = bank.issueGoldLoan(ccustomerr);
        System.out.println("Gold loan amount is..." + gloan);
        double hloan = bank.issueHouseLoan(ccustomerr);
        System.out.println("House loan amount is..." + hloan);
        double vloan = bank.issueVehicleLoan("bike", ccustomerr);
        System.out.println("Vehicle loan amount is..." + vloan);
        System.out.println("Caution money is..." + IBank.CAUTION_MONEY);
    }
}
