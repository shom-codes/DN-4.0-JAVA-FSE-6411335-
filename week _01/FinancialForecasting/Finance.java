package FinancialForecasting;

import java.util.Scanner;

public class Finance {
    public static double calculate(double val, double rate, int year) {
        if (year == 0) {
            return val;
        }
        return calculate((val + val * rate), rate, year - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current value: ");
        float currentVal = sc.nextFloat();

        System.out.print("Enter growth rate: ");
        float rate = sc.nextFloat();

        System.out.print("Enter the number of years: ");
        int year = sc.nextInt();
        
        double val = calculate(currentVal, rate, year);
        System.out.println(val);
    }
}
