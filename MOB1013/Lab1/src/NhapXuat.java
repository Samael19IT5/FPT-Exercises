import java.util.Scanner;

public class NhapXuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String name = scanner.nextLine();
        System.out.print("Điểm TB: ");
        double score = scanner.nextDouble();
        System.out.println(name + " " + score + " điểm");
    }
}