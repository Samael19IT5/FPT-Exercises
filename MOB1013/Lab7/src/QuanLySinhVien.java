import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySinhVien {
    static ArrayList<SinhVienPoly> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static Comparator<SinhVienPoly> comp = Comparator.comparingDouble(SinhVienPoly::getDiem);

    public static void main(String[] args) {
        System.out.println("+----------Quản lý sinh viên----------+");
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuât danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếo danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.print("Chọn chức năng: ");
            int n = Integer.parseInt(scanner.nextLine());
            if (n == 1) {
                Nhap();
            } else if (n == 2) {
                Xuat();
            } else if (n == 3) {
                SVGioi();
            } else if (n == 4) {
                SapXep();
            } else {
                break;
            }
        }
    }

    static void Nhap() {
        do {
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Ngành(II/Biz): ");
            String nganh = scanner.nextLine();
            while (!nganh.equalsIgnoreCase("IT") && !nganh.equalsIgnoreCase("Biz")) {
                System.out.print("Ngành không đúng, nhập lại: ");
                nganh = scanner.nextLine();
            }
            if (nganh.equalsIgnoreCase("IT")) {
                System.out.print("Điểm Java: ");
                double diemJava = Double.parseDouble(scanner.nextLine());
                System.out.print("Điểm Css: ");
                double diemCss = Double.parseDouble(scanner.nextLine());
                System.out.print("Điểm Html: ");
                double diemHtml = Double.parseDouble(scanner.nextLine());
                SinhVienPoly svIT = new SinhVienIT(hoTen, diemJava, diemCss, diemHtml);
                list.add(svIT);
            } else {
                System.out.print("Điểm Marketing: ");
                double diemMarketing = Double.parseDouble(scanner.nextLine());
                System.out.print("Điểm Sales: ");
                double diemSales = Double.parseDouble(scanner.nextLine());
                SinhVienPoly svBiz = new SinhVienBiz(hoTen, diemMarketing, diemSales);
                list.add(svBiz);
            }
            System.out.print("Nhập tiếp (Y/N)?");
        } while (!scanner.nextLine().equalsIgnoreCase("N"));
        System.out.println("+-------------------------------------+");
    }

    static void Xuat() {
        for (SinhVienPoly i : list) {
            System.out.print((list.indexOf(i) + 1));
            i.xuat();
        }
        System.out.println("+-------------------------------------+");
    }

    static void SVGioi() {
        for (SinhVienPoly i : list) {
            if (i.getHocLuc().equals("Giỏi")) {
                System.out.print((list.indexOf(i) + 1));
                i.xuat();
            }
        }
        System.out.println("+-------------------------------------+");
    }

    static void SapXep() {
        list.sort(comp);
        System.out.println("+-------------------------------------+");
    }
}
