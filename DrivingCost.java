import java.util.Scanner;
public class DrivingCost{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double gallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price = input.nextDouble();
        double cost = (distance / gallon) * price;
        System.out.printf("The driving cost is %f%n", cost);
    }
}
