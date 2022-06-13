public abstract class NhanVien {
    String manv;
    String hoten;
    double luong;

    public NhanVien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    abstract double getThuNhap();

    double getThueThuNhap() {
        if (getThuNhap() < 9000000) {
            return 0;
        } else if (getThuNhap() >= 9000000 && getThuNhap() <= 15000000) {
            return .1;
        } else {
            return .12;
        }
    }

    public void xuatThongTin() {
        System.out.println("Mã NV: " + manv + "\tHọ tên: " + hoten + "\tLương: " + luong + "\tTổng thu nhập: " + (getThuNhap() - getThuNhap() * getThueThuNhap()));
    }
}
