import java.util.Scanner;

public class GiaiPTB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Vô số nghiệm");
                } else {
                    System.out.println("Vô nghiệm");
                }
            } else {
                System.out.println("Nghiệm x= " + (-c / b));
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Nghiệm kép x= " + (-b / 2 * a));
            } else {
                System.out.println("2 nghiệm phân biệt:\nx1= " + ((-b + Math.sqrt(delta)) / 2 * a) + "\nx2= " + ((-b - Math.sqrt(delta)) / 2 * a));
            }
        }
    }
}
