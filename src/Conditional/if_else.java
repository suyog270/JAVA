import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {

        Scanner agee = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = agee.nextInt();
        if (age == 16){
            System.out.println("Hello");
        }
        else{
            System.out.println("Bye");
        }
    }
}
