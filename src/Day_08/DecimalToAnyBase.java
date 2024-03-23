package Day_08;
import java.util.Scanner;
public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();
        System.out.println("Enter any Base");
        int base = scn.nextInt();
        int sum = 0;
        int mul = 1;
        while(n != 0){
            int temp = n%base;
            sum = sum+(temp*mul);
            n = n/base;
            mul = mul*10;
        }
        System.out.println(sum);
    }
}
