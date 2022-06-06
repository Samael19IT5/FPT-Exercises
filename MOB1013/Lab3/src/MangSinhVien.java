import java.util.Scanner;

public class MangSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số sinh viên: ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] hoTen = new String[n];
        double[] diem = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Họ tên sinh viên " + (i + 1) + ": ");
            hoTen[i] = scanner.nextLine();
            System.out.print("Điểm sinh viên " + (i + 1) + ": ");
            diem[i] = Double.parseDouble(scanner.nextLine().replace(",", "."));
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    double tmpdiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tmpdiem;
                    String tmpHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tmpHoTen;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println("Học lực: " + hocLuc(diem[i]));
        }
    }

    public static String hocLuc(double diem) {
        if (diem < 5) {
            return "Yếu";
        } else if (diem >= 5 && diem < 6.5) {
            return "Trung bình";
        } else if (diem >= 7.5 && diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
}
