import java.util.Scanner;
public class NewtonDistance{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter intial velocity, timeTaken and acceleration ");
        double initialVelocity = input.nextDouble();
        double timeTaken = input.nextDouble();
        double acceleration = input.nextDouble();
        double distance = (initialVelocity * timeTaken) + (acceleration * timeTaken * timeTaken) / 2;
        System.out.printf("The distance covered is %f%n", distance);
    }
}
