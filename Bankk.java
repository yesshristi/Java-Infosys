class Bankk {
  private String bankName, area;
  private String phoneNumber;
  Bankk() {    // Default constructor
    bankName = "IBank";
    area = "Gandhi Nagar";
    phoneNumber = "9876543210";
  }
  Bankk(String bname, String barea, String phoneNo) {  // Parameterized constructor
    bankName = bname;
    area = barea;
    phoneNumber = phoneNo;
  }
  void displayBankDetails(){
      System.out.println("bank Name: " + bankName);
      System.out.println("Area of bank: " + area);
      System.out.println("Phone number of bank: " + phoneNumber);
  }
  
  public static void main(String[] args){
      Bankk bank1 = new Bankk();  //call default constructor
      Bankk bank2 = new Bankk("IBank", "Jaydev Nagar", "8876543219"); //call Parameterized constructor
      
      bank1.displayBankDetails();
      System.out.println("***********************");
      bank2.displayBankDetails();
  }
}