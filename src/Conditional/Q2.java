import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        String name = "Suyog";
        if (name == "Suyog"){
            System.out.println("Welcome");
        }
        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age");

        int a = age.nextInt();
        if (a == 16){
            System.out.println("Welcome");
        }
    }
}
