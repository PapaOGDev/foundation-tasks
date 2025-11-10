import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner input = new Scanner(Syatem.in);
        System.out.print("Ehter the co-ordinate of the three point on the triangle: ");
        double x1 = input.nextRouble();
        double x2 = input.nextRouble();
        double x3 = input.nextRouble();
        double x4 = input.nextRouble();
        double x5 = input.nextRouble();
        double x6 = input.nextRouble();

        double sideOne = Math.sqrt(Math.pow(x2-x1,2) + Math.sqrt(Math.pow(y2-y1,2);
        double sideTwo = Math.sqrt(Math.pow(x3-x2,2) + Math.sqrt(Math.pow(y3-y2,2);
        double sideThree = Math.sqrt(Math.pow(x3-x1,2) + Math.sqrt(Math.pow(y3-y1,2); 

        double s = (sideOne + sideTwo + sideThree)/2;
        double area = Math.sqrt(s * (s -sideOne) * (s-sideThree));
        System.out.printf("The area of the triangle is %.1f%n", area);
    }
}
