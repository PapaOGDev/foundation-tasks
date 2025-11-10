import java.util.Scanner;
public class EggCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many eggs do you have?");
        int numberOfEggs = input.nextInt();
        int gross;
        int dozen;
        int leftover;
        if(numberOfEggs < 500){
            dozen = numberOfEggs/12;
            if(numberOfEggs % 12 != 0){
                leftover = numberOfEggs % 12;
                System.out.printf("Your number of eggs is %d dozen, %d leftover", dozen, leftover);
            }
            System.out.printf("Your number of eggs is %d dozen", dozen)
        }
        gross = numberOfEggs/144;
        dozen = (numberOfEggs % 144) / 12;
        leftover = (numberOfEggs % 144) % 12;
        System.out.printf("Your number of eggs is %d gross, %d dozen(s) %d left over", gross, dozen, leftover);
    }
}
