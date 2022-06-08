import java.util.Scanner;

public class HoVaTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hoVaTen = scanner.nextLine().trim();
        String ho = hoVaTen.substring(0, hoVaTen.indexOf(" ")).toUpperCase();
        String dem = hoVaTen.substring(hoVaTen.indexOf(" "), hoVaTen.lastIndexOf(" "));
        String ten = hoVaTen.substring(hoVaTen.lastIndexOf(" ")).toUpperCase();
        System.out.println(ho + dem + ten);
    }
}
