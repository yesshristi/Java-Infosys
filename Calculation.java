public class Calculation{
   public static void main(String[] args){
      double d = 234.04;
      long l = (long)d;   //explicit type casting
      int i = (int)l;     // explicit type casting

      int i1 = 300;
      long l1 = i;       //no explicit type casting
      float f1 = l;     //no explicit type casting

 System.out.println("Narrowing conversion requires explicit type casting.");
      System.out.println("double value :"+d);//Narrowing conversion requires explicit type casting.
      System.out.println("long value :"+l);//Narrowing conversion requires explicit type casting.
      System.out.println("int value :"+i);//Narrowing conversion requires explicit type casting.

      System.out.println("Widening conversion has implicit type casting.");
      System.out.println("int value :"+i1); //Widening conversion has implicit type casting.
      System.out.println("long value :"+l1); //Widening conversion has implicit type casting.
      System.out.println("float value :"+f1); //Widening conversion has implicit type casting.
   }
}

