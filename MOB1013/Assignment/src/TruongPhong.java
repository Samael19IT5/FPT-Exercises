public class TruongPhong extends NhanVien {
    double trachNhiem;

    public TruongPhong(String manv, String hoten, double luong, double trachNhiem) {
        super(manv, hoten, luong);
        this.trachNhiem = trachNhiem;
    }

    @Override
    double getThuNhap() {
        return luong + trachNhiem;
    }
}
