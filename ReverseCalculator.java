import java.util.Scanner;

public class ReverseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to reverse: ");
        String userNum = sc.nextLine();
        String temp = "";
        int l = userNum.length() - 1;
        while (temp.length() != userNum.length()) {
            temp += userNum.charAt(l);
            --l;
        }
        System.out.println(temp);
        temp = "";
        for (int i = userNum.length() - 1; i >= 0; --i) {
            temp += userNum.charAt(i);
        }
        System.out.println(temp);
        temp = "";
        l = userNum.length() - 1;
        do {
            temp += userNum.charAt(l);
            --l;
        } while (temp.length() != userNum.length());
        System.out.println(temp);
    }

}
