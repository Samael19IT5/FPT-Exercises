import java.util.Scanner;

public class VdMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tong = 0;
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = Integer.parseInt(scanner.nextLine());
            tong += a[i];
        }
        System.out.println("Tổng các phần tử: " + tong);
        try {
            System.out.print("a[6]= ");
            a[5] = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
