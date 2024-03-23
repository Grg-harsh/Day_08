package Day_08;
import java.util.Scanner;
public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = scn.nextInt();
        System.out.println("Enter the first value1");
        int n1 = scn.nextInt();
        System.out.println("Enter the second value1");
        int n2 = scn.nextInt();
        int mul = 1;
        int ans = 0;
        int carry = 0;
        while(n1 > 0 || n2 > 0 || carry > 0){
            int temp1 = n1%10;
            int temp2 = n2%10;
            int sum = temp1+temp2+carry;
            carry = sum/base;
            sum = sum%base;
            ans = ans + (sum*mul);
            mul = mul*10;
            n1 = n1/10;
            n2 = n2/10;
        }
        System.out.println(ans);
    }
}
