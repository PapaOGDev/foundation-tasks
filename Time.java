import java.util.Scanner;
public class Time{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int munites = input.nextInt();
        int numberOfYears;
        int numberOfDays;
        if(munites > 525600){
            numberOfYears = munites/525600;
            numberOfDays = (munites % 525600) / 1440;
            System.out.printf("%d is approximately %d year(s) and %d day(s)%n", munites, numberOfYears, numberOfDays);
        }else{
        numberOfDays = munites / 1440;
        System.out.printf("%d is approximately %d days%n", munites, numberOfDays);
        }
    }
}
