package Conditional;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Enter first no: ");
        double num1 = calc.nextDouble();

        System.out.println("Enter second no: ");
        double num2 = calc.nextDouble();

        System.out.println("Enter an operator: ");
        String operator = calc.nextLine();

        if (operator.equals("+")){
            double result = num1 + num2;
            System.out.println(num1 + operator + num2 + " = " + result);
        } else if (operator.equals("-")) {
            double result = num1 - num2;
            System.out.println(num1 +operator + num2 + " = "+ result);
        }
    }
}
