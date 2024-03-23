package Day_08;

import java.util.Scanner;

public class AnyToany {
    static int mul = 1;
    static int sum = 0;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();
        System.out.println("Enter a base");
        int base1 = scn.nextInt();
        System.out.println("Enter a another base");
        int base2 = scn.nextInt();
        int anydec = anyToDecimal(n,base1);
        int decAny = decToAny(anydec, base2);
        System.out.println(decAny);
    }
    public static int anyToDecimal(int n, int base1){
        while(n!=0){
            int temp = n%10;
            sum = sum + (temp*mul);
            mul = mul*base1;
            n = n/10;
        }
        return sum;
    }
    public static int decToAny(int n,int base2){
        sum = 0;
        mul = 1;
        while(n != 0){
            int temp = n%base2;
            sum = sum + (temp*mul);
            mul = mul*10;
            n = n/base2;
        }
        return sum;
    }
}
