import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySanPham {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<SanPham> list = new ArrayList<>();
    static Comparator<SanPham> comp = Comparator.comparingInt(o -> o.donGia);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("+--------------------------+");
            System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            System.out.println("5. Kết thúc");
            System.out.println("Chọn chức năng: ");
            int n = Integer.parseInt(scanner.nextLine());
            boolean lap = true;
            switch (n) {
                case 1 -> nhap();
                case 2 -> sapxep();
                case 3 -> xoa();
                case 4 -> trungbinh();
                default -> lap = false;
            }
            if (!lap) {
                break;
            }
        }
    }

    public static void nhap() {
        do {
            System.out.print("Tên sản phẩm: ");
            String tenSp = scanner.nextLine();
            System.out.print("Đơn giá: ");
            int donGia = Integer.parseInt(scanner.nextLine());
            SanPham sp = new SanPham(tenSp, donGia);
            list.add(sp);
            System.out.print("Nhập thêm (Y/N)?");
        } while (!scanner.nextLine().equals("N"));
    }

    public static void sapxep() {
        list.sort(comp);
        for (SanPham i : list) {
            System.out.println("Sản phẩm " + (list.indexOf(i) + 1) + ":");
            System.out.println("Tên sản phẩm: " + i.tenSp);
            System.out.println("Đơn giá: " + i.donGia);
        }
    }

    public static void xoa() {
        System.out.print("Tên sản phẩm: ");
        String xoa = scanner.nextLine();
        for (SanPham i : list) {
            if (i.tenSp.equals(xoa)) {
                list.remove(i);
                break;
            }
        }
    }

    public static void trungbinh() {
        double s = 0;
        for (SanPham i : list) {
            s += i.donGia;
        }
        System.out.println("Giá trung bình của các sản phẩm: " + s / list.size());
    }
}
