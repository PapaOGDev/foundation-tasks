import java.util.Scanner;
public class Gratuity{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a subtotal and a gratuity rate: ");
        double subtotal = input.nextInt();
        double gratuity_rate = input.nextInt();
        double gratuity = (gratuity_rate / 100) * subtotal;
        double total = gratuity + subtotal;
        System.out.print("The gratuity is %f and the total is %f", gratuity, total);
    }
}
