//To understand implicit type casting with Primitive types in Java.
//To understand the creation and execution of a program on implicit type casting with Primitive types in Java.

public class Calculation1{
   public static void main(String[] args){
      int i = 300;
      long l = i;       //no explicit type casting
      float f = l;     //no explicit type casting
      System.out.println("int value :"+i);
      System.out.println("long value :"+l);
      System.out.println("float value :"+f);
   }
}
