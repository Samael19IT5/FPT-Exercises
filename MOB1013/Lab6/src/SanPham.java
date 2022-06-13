import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
    String tenSp;
    double donGia;
    String hang;

    public SanPham(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    public static void xuat(ArrayList<SanPham> list) {
        for (SanPham i : list) {
            if (i.hang.equals("Nokia")) {
                System.out.println((list.indexOf(i) + 1) + ". Tên sản phẩm: " + i.tenSp +
                        "\tĐơn giá: " + i.donGia + "\tHãng: " + i.hang);
            }
        }
    }

    public static void nhap(ArrayList<SanPham> list, Scanner scanner) {
        System.out.print("Tên sản phẩm: ");
        String tenSp = scanner.nextLine();
        System.out.print("Đơn giá: ");
        double donGia = Double.parseDouble(scanner.nextLine());
        System.out.print("Hãng: ");
        String hang = scanner.nextLine();
        SanPham sp = new SanPham(tenSp, donGia, hang);
        list.add(sp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Sản phẩm " + (i + 1) + ": ");
            nhap(list, scanner);
        }
        xuat(list);
    }
}
