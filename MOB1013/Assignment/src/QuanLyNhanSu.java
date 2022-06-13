import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyNhanSu {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<NhanVien> list = new ArrayList<>();
    static Comparator<NhanVien> hoTenComp = Comparator.comparing(o -> o.hoten);
    static Comparator<NhanVien> thuNhapComp = Comparator.comparingDouble(NhanVien::getThuNhap);

    public static void main(String[] args) {
        System.out.println("+-----------Quản lý nhân sự-----------+");
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("1. Nhập danh sách nhân viên");
            System.out.println("2. Xuất danh sách nhân viên");
            System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập");
            System.out.println("4. Xóa nhân viên theo mã nhập");
            System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập");
            System.out.println("6. Tìm các nhân viên theo khoảng lương");
            System.out.println("7. Sắp xếp nhân viên theo họ và tên");
            System.out.println("8. Sắp xếp nhân viên theo thu nhập");
            System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
            System.out.println("10. Thoát");
            System.out.print("Chọn chức năng: ");
            int n = Integer.parseInt(scanner.nextLine());
            if (n == 1) {
                nhap();
            } else if (n == 2) {
                xuat();
            } else if (n == 3) {
                timMaNv();
            } else if (n == 4) {
                xoa();
            } else if (n == 5) {
                capnhat();
            } else if (n == 6) {
                timLuong();
            } else if (n == 7) {
                sapxepHoTen();
            } else if (n == 8) {
                sapxepThuNhap();
            } else if (n == 9) {
                thuNhapCaoNhat();
            } else if (n == 10) {
                break;
            } else {
                System.out.println("+-------------------------------------+");
            }
        }
    }

    public static void nhap() {
        do {
            System.out.println("Loại nhân viên:");
            System.out.println("1. Tiếp thị");
            System.out.println("2. Trưởng phòng");
            System.out.print("Chọn nhân viên:");
            int nv = Integer.parseInt(scanner.nextLine());
            while (nv != 1 && nv != 2) {
                System.out.print("Nhập lại: ");
                nv = Integer.parseInt(scanner.nextLine());
            }
            System.out.print("Mã NV: ");
            String manv = scanner.nextLine();
            System.out.print("Họ tên: ");
            String hoten = scanner.nextLine();
            System.out.print("Lương: ");
            double luong = Double.parseDouble(scanner.nextLine());
            if (nv == 1) {
                System.out.print("Doanh số: ");
                double doanhSo = Double.parseDouble(scanner.nextLine());
                System.out.print("Huê hồng: ");
                double hueHong = Double.parseDouble(scanner.nextLine());
                NhanVien tiepThi = new TiepThi(manv, hoten, luong, doanhSo, hueHong);
                list.add(tiepThi);
            } else {
                System.out.print("Trách nhiệm: ");
                double trachNhiem = Double.parseDouble(scanner.nextLine());
                NhanVien truongPhong = new TruongPhong(manv, hoten, luong, trachNhiem);
                list.add(truongPhong);
            }
            System.out.print("Nhập tiếp (Y/N)?: ");
        } while (!scanner.nextLine().equalsIgnoreCase("N"));
        System.out.println("+-------------------------------------+");
    }

    public static void xuat() {
        for (NhanVien i : list) {
            System.out.print((list.indexOf(i) + 1) + ". ");
            i.xuatThongTin();
        }
        System.out.println("+-------------------------------------+");
    }

    public static void timMaNv() {
        System.out.print("Mã NV: ");
        String manv = scanner.nextLine();
        for (NhanVien i : list) {
            if (manv.equalsIgnoreCase(i.manv)) {
                i.xuatThongTin();
                break;
            }
        }
        System.out.println("+-------------------------------------+");
    }

    public static void xoa() {
        System.out.print("Mã NV: ");
        String manv = scanner.nextLine();
        for (NhanVien i : list) {
            if (manv.equalsIgnoreCase(i.manv)) {
                list.remove(i);
                break;
            }
        }
        System.out.println("+-------------------------------------+");
    }

    public static void capnhat() {
        System.out.print("Mã NV: ");
        String manv = scanner.nextLine();
        for (NhanVien i : list) {
            if (manv.equalsIgnoreCase(i.manv)) {
                int index = list.indexOf(i);
                System.out.print("Họ tên: ");
                String hoten = scanner.nextLine();
                System.out.print("Lương: ");
                double luong = Double.parseDouble(scanner.nextLine());
                if (String.valueOf(i).split("@")[0].equals("TiepThi")) {
                    System.out.print("Doanh số: ");
                    double doanhSo = Double.parseDouble(scanner.nextLine());
                    System.out.print("Huê hồng: ");
                    double hueHong = Double.parseDouble(scanner.nextLine());
                    NhanVien tiepThi = new TiepThi(i.manv, hoten, luong, doanhSo, hueHong);
                    list.remove(index);
                    list.add(index, tiepThi);
                } else {
                    System.out.print("Trách nhiệm: ");
                    double trachNhiem = Double.parseDouble(scanner.nextLine());
                    NhanVien truongPhong = new TruongPhong(i.manv, hoten, luong, trachNhiem);
                    list.remove(index);
                    list.add(truongPhong);
                }
                break;
            }
        }
        System.out.println("+-------------------------------------+");
    }

    public static void timLuong() {
        System.out.print("Bắt đầu từ: ");
        double from = Double.parseDouble(scanner.nextLine());
        System.out.print("Đến: ");
        double to = Double.parseDouble(scanner.nextLine());
        for (NhanVien i : list) {
            if (i.luong >= from && i.luong <= to) {
                i.xuatThongTin();
            }
        }
        System.out.println("+-------------------------------------+");
    }

    public static void sapxepHoTen() {
        list.sort(hoTenComp);
        System.out.println("+-------------------------------------+");
    }

    public static void sapxepThuNhap() {
        list.sort(thuNhapComp);
        System.out.println("+-------------------------------------+");
    }

    public static void thuNhapCaoNhat() {
        ArrayList<NhanVien> tempList = list;
        tempList.sort(thuNhapComp);
        Collections.reverse(tempList);
        for (int i = 0; i < 5; i++) {
            tempList.get(i).xuatThongTin();
        }
        System.out.println("+-------------------------------------+");
    }
}
