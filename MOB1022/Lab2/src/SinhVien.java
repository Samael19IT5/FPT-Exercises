import java.util.Scanner;

public class SinhVien {
    private int maSv;
    private String hoTen;
    private int diem;
    private String xepLoai;
    private static final int DIEM = 0;
    private static final String XEPLOAI = "CHUA_XEP_LOAI";
    private static final int MASV = 0;
    private static final String HOTEN = "CHUA_CO_TEN";

    public SinhVien(int maSv, String hoTen, int diem, String xepLoai) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.diem = diem;
        this.xepLoai = xepLoai;
    }

    public SinhVien() {
        this(MASV, HOTEN, DIEM, XEPLOAI);
    }

    public int getMaSv() {
        return maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai() {
        if (diem >= 8) {
            xepLoai = "Gioi";
        } else if (diem >= 7) {
            xepLoai = "Kha";
        } else if (diem >= 5) {
            xepLoai = "Trung binh";
        } else {
            xepLoai = "Kem";
        }
    }

    public String toString() {
        return getMaSv() + "\t" + getHoTen() + "\t" + getDiem() + "\t" + getXepLoai() + "\n";
    }

    public void nhapDl() {
        boolean success = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        while (!success) {
            try {
                setMaSv(Integer.parseInt(input.nextLine()));
                success = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap du lieu kieu so! Nhap lai: ");
            }
        }
        System.out.print("Nhap ho ten: ");
        setHoTen(input.nextLine());
        success = false;
        System.out.print("Nhap diem: ");
        while (!success) {
            try {
                setDiem(Integer.parseInt(input.nextLine()));
                success = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap du lieu kieu so! Nhap lai: ");
            }
        }
    }

    public static void main(String[] args) {
        SinhVien s = new SinhVien();
        System.out.println("Sinh vien: " + s);
        s.nhapDl();
        s.setXepLoai();
        System.out.println("Sau khi nhap:");
        System.out.println(s);
    }
}
