package Day_08;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = scn.nextInt();
        System.out.println("Enter the base value");
        int base = scn.nextInt();
        int sum = 0;
        int mul = 1;
        while(n != 0){
            int temp = n%10;
            sum = sum+(temp*mul);
            mul = mul*base;
            n = n/10;
        }
        System.out.println(sum);
    }
}
