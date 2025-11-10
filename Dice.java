import java.util.Scanner;
public class Dice{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("The first die");
        int firstRoll = input.nextInt();
        System.out.println("The second die");
        int secondRoll = input.nextInt();
        int result = firstRoll + secondRoll;
        System.out.printf("The total roll is %d", result);
    }
}
