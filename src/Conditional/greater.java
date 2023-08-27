import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter first no.");
        int a = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter second no.");
        int b = num2.nextInt();

        if (a>b){
            System.out.println(a + " is greater than " + b);
        }
        else if (a==b){
            System.out.println(a + " and "+b+" are equal");
            }
        else{
            System.out.println(b+" is greater than "+ a);
        }
    }
}
