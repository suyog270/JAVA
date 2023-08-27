import java.util.Scanner;
public class posnev {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = num.nextInt();
        if (num1>0){
            System.out.println(num1 + " is positive");
        } else if (num1 == 0) {
            System.out.println(num1 + " is zero");
        } else{
            System.out.println(num1 + " is odd");
        }
    }
}