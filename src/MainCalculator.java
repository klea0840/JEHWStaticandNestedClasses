import java.util.Scanner;

public class MainCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1 number: ");
        double i = sc.nextDouble();
        System.out.print("Enter the 2 number: ");
        double j = sc.nextDouble();

        Calculator.sum(i, j);
        Calculator.div(i, j);
        Calculator.sub(i, j);
        Calculator.mult(i, j);
    }
}
