import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSoThuc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        do {
            Double x = Double.parseDouble(scanner.nextLine().replace(",", "."));
            list.add(x);
            System.out.print("Nhập thêm (Y/N)?");
        } while (!scanner.nextLine().equals("N"));
        for (Double i : list) {
            System.out.print(i + " ");
        }
    }
}
