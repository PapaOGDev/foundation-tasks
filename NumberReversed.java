import java.util.Scanner;
public class NumberReversed{
    public static void main(String[] args){
        int number = 1234;
        int firstNumber = number/1000;
        int secondNumber = number/100%10;
        int thirdNumber = number/10%10;
        int fourthNumber = number%10;
        System.out.printf("%d%d%d%d",fourthNumber,thirdNumber,secondNumber,fouthNumber);
    }
}
