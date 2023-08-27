import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        String name;
        //Creating object of Scanner
        Scanner scc = new Scanner(System.in);

        //Displaying input message
        System.out.println("Enter your name: ");

        //Taking input form user
        name = scc.next();
        System.out.println("Your name is "+ name);

        }
    }

