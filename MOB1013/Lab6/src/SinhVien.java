import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
    String hoTen;
    String email;
    String sdt;
    String cmnd;

    public SinhVien(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public static void xuat(ArrayList<SinhVien> list) {
        for (SinhVien i : list) {
            System.out.println((list.indexOf(i) + 1) + ". Họ tên: " + i.hoTen +
                    "\tEmail: " + i.email + "\tSố điện thoại: " + i.sdt + "\tCMND: " + i.cmnd);
        }
    }

    public static void nhap(ArrayList<SinhVien> list, Scanner scanner) {
        System.out.print("Họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        while (!email.matches("\\w+@\\w+\\.\\w+")) {
            System.out.print("Email không đúng, nhập lại: ");
            email = scanner.nextLine();
        }
        System.out.print("Số điện thoại: ");
        String sdt = scanner.nextLine();
        while (!sdt.matches("0\\d{9,10}")) {
            System.out.print("Số điện thoại không đúng, nhập lại: ");
            sdt = scanner.nextLine();
        }
        System.out.print("CMND: ");
        String cmnd = scanner.nextLine();
        while (!cmnd.matches("\\d{9}")) {
            System.out.print("CMND không đúng, nhập lại: ");
            cmnd = scanner.nextLine();
        }
        SinhVien sinhVien = new SinhVien(hoTen, email, sdt, cmnd);
        list.add(sinhVien);
    }

    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Sinh viên " + (i + 1) + ": ");
            nhap(list, scanner);
        }
        xuat(list);
    }
}
