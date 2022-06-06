import java.util.Scanner;

public class TheTichKhoiLapPhuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cạnh: ");
        double canh = scanner.nextDouble();
        System.out.println("Thể tích khối lập phương: " + Math.pow(canh, 3));
    }
}
