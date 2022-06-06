import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cạnh thứ 1: ");
        double a = scanner.nextDouble();
        System.out.print("Cạnh thứ 2 : ");
        double b = scanner.nextDouble();
        System.out.println("Chu vi: " + (a + b) * 2 + "\nDiện tích: " + a * b + "\nCạnh nhỏ nhất: " + Math.min(a, b));
    }
}
