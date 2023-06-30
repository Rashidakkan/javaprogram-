import java.util.*;

public class statements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value 1:");
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("invalid number");
        } else if (a % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");

            sc.close();
        }
    }
}
