public class Swap {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 2;
        num2 = 3;
        System.out.println("before swap");
        System.out.println(num1);
        System.out.println(num2);
        num3 = num2;
        num2 = num1;
        num1 = num3;
        System.out.println("After swap");
        System.out.println(num1);
        System.out.println(num2);
    }
}
