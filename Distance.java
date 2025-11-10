import java.util.Scanner;
public class Distance{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double mile = input.nextDouble();
        double kilometer = miles * 1.6;
        System.out.printf("%d mile(s) is %d kilometer(s)", mile, kilometer);      
    }
}
