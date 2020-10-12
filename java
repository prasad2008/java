import java.util.Scanner;
public class AddTwoNumbers2 {

    public static void main(String[] args) {
        
        int num1, num2, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        s = num1 + num2;
        int n = num1 - num2;
        System.out.println("Sum of these numbers: "+s);
    }
}
