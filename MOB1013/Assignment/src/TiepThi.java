public class TiepThi extends NhanVien {
    double doanhSo;
    double hueHong;

    public TiepThi(String manv, String hoten, double luong, double doanhSo, double hueHong) {
        super(manv, hoten, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    @Override
    double getThuNhap() {
        return luong + doanhSo * hueHong;
    }
}
