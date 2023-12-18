class Loann{
   private float interest;
   Loann(){
      interest = 8.5f;
   }
   //calculateEMI overloaded methods
   public double calculateEMI(int tenure, double principal){
      double simpleInterest = (principal*interest*tenure) / 100;
      return (simpleInterest+principal)/tenure;
   }
   public double calculateEMI(double principal, int tenure){
      double simpleInterest = (principal*interest*tenure) / 100;
      return (simpleInterest+principal)/tenure;
   }
   public double calculateEMI(int tenure, double principal, float interest){
      double simpleInterest = (principal*interest*tenure) / 100;
      return (simpleInterest+principal)/tenure;
   }
   public static void main(String[] args){
      Loann loann = new Loann();
      double result = loann.calculateEMI(22000d,5);
      double value = loann.calculateEMI(5,50000d);
      double val = loann.calculateEMI(5,20000,9.5f);
      System.out.println("EMI per year is :"+result);
      System.out.println("EMI per year is :"+value);
      System.out.println("EMI per year is :"+val);
   }
}
