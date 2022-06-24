import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        double r = Double.parseDouble(scanner.nextLine());
        System.out.println("Chu vi: " + (2 * r * Math.PI));
        System.out.println("Diện tích: " + (r * r * Math.PI));
    }
}
