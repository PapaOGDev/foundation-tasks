import java.util.Scanner;
public class Investment{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double interest_rate = input.nextDouble();
        double monthly_interest_rate = interest_rate / 1200;
        System.out.print("Enter number of years: ");
        int period = input.nextInt();
        double futureInvestmentValue = amount * Math.pow((1 + monthly_interest_rate), (period*12));
        System.out.printf("Your future investment is $%.2f", futureInvestmentValue);
    }
}
