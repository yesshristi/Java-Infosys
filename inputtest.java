import java.util.Scanner;
public class InputTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while(a!=10){
            System.out.println("hello: ");
            a = sc.nextInt();
        }
        sc.close();
    }
    
}
