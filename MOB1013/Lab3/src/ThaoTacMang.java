import java.util.Arrays;
import java.util.Scanner;

public class ThaoTacMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số phần tử: ");
        int n = scanner.nextInt(), d = 0;
        int[] mang = new int[n];
        double s = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Mảng[" + i + "]= ");
            mang[i] = scanner.nextInt();
            if (mang[i] % 3 == 0) {
                s += mang[i];
                d++;
            }
        }
        Arrays.sort(mang);
        System.out.println("Sắp xếp mảng: " + Arrays.toString(mang).replace("[", "").replace("]", ""));
        System.out.println("Phần tử có giá trị nhỏ nhất: " + mang[0]);
        System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + s / d);
    }
}
