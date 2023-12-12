public class Bill {
   int billId,customerId,discount; 
   double billAmount,discountedBillAmount;

   void setBillValue(int billId,int customerId,int discount,double billAmount){
    this.billId = billId;
    this.customerId = customerId;
    this.discount = discount;
    this.billAmount = billAmount;
   }
   
   void calculateDiscountedBillAmount(){
    discountedBillAmount = billAmount - (billAmount *((double)discount/100));
   }

   public static void main(String[] args){
    Bill b = new Bill();
    b.setBillValue(1011, 101, 2, 199.99);
    b.calculateDiscountedBillAmount();
    System.out.println(b.discountedBillAmount);
   }
}
