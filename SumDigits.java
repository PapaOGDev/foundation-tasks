import java.util.Scanner;
public class SumDigits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int total;
        if(number < 10){
            System.out.printf("The sum of the digits is %d", number);
        }
        if(number > 9 && number <= 99){
            firstNumber = number / 10;
            secondNumber = number % 10;
            total = firstNumber + secondNumber;
            System.out.printf("The sum of the digits is %d", total);
        }
        if(number > 99 && number <= 999){
            firstNumber = number / 100;
            secondNumber = (number / 10) % 10;
            thirdNumber = number % 10;
            total = firstNumber + secondNumber + thirdNumber;
            System.out.printf("The sum of the digits is %d", total);
        }
        if(number == 1000){
            firstNumber = number / 1000;
            secondNumber = (number / 100) % 10;
            thirdNumber = (number / 10) % 10;
            fourthNumber = number % 10;
            total = firstNumber + secondNumber + thirdNumber + fourthNumber;
            System.out.printf("The sum of the digits is %d", total);            
        }
    }
}
