import java.util.Scanner;

public class GiaiPTB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Vô số nghiệm");
            } else {
                System.out.println("Vô nghiệm");
            }
        } else {
            System.out.println("Nghiệm x= " + (-b / a));
        }
    }
}