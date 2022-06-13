import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachhHoVaTen {
    static ArrayList<String> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("+--------------------------+");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            System.out.println("Chọn chức năng: ");
            int n = Integer.parseInt(scanner.nextLine());
            boolean lap = true;
            switch (n) {
                case 1 -> nhap();
                case 2 -> xuat();
                case 3 -> ngaunhien();
                case 4 -> sapxep();
                case 5 -> xoa();
                default -> lap = false;
            }
            if (!lap) {
                break;
            }
        }
    }

    public static void nhap() {
        do {
            String x = scanner.nextLine();
            list.add(x);
            System.out.print("Nhập thêm (Y/N)?");
        } while (!scanner.nextLine().equals("N"));
    }

    public static void xuat() {
        for (String i : list) {
            System.out.println("Họ và tên " + (list.indexOf(i) + 1) + ": " + i);
        }
    }

    public static void ngaunhien() {
        Collections.shuffle(list);
        xuat();
    }

    public static void sapxep() {
        Collections.sort(list);
        Collections.reverse(list);
        xuat();
    }

    public static void xoa() {
        String xoa = scanner.nextLine();
        for (String i : list) {
            if (i.equals(xoa)) {
                list.remove(i);
                break;
            }
        }
    }
}
