import java.util.Scanner;
public class oddeve {
    public static void main(String[] args) {
        int num1;
        Scanner no = new Scanner(System.in);
        System.out.println("Enter a number");
        num1 = no.nextInt();
        if (num1 % 2 == 0){
            System.out.println( num1 + " Is even");
        }
        else{
            System.out.println(num1 +" is odd");
        }
    }
}
