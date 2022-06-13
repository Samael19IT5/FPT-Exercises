public abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    public SinhVienPoly() {
    }

    abstract double getDiem();

    String getHocLuc() {
        if (getDiem() < 5) {
            return "Yếu";
        } else if (getDiem() >= 5 && getDiem() < 6.5) {
            return "Trung bình";
        } else if (getDiem() >= 6.5 && getDiem() < 7.5) {
            return "Khá";
        } else if (getDiem() >= 7.5 && getDiem() < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }

    void xuat() {
        System.out.println(". Họ tên: " + hoTen + "\tNgành: " + nganh + "\tĐiểm: " + getDiem() + "\tHọc lực: " + getHocLuc());
    }
}

