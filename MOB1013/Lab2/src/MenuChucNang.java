import java.util.Scanner;

public class MenuChucNang {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int n = scanner.nextInt();
        switch (n) {
            case 1 -> giaiPTB1();
            case 2 -> giaiPTB2();
            case 3 -> tinhTienDien();
            default -> {
            }
        }
    }

    public static void menu() {
        System.out.println("+------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc hai");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+------------------------------+");
        System.out.print("Chọn chức năng: ");
    }

    public static void giaiPTB1() {
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

    public static void giaiPTB2() {
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

    public static void tinhTienDien() {
        System.out.print("Số điện sử dụng của tháng: ");
        int soDien = scanner.nextInt();
        int tien;
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        System.out.println("Tiền điện: " + tien);
    }
}
