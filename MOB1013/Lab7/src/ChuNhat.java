public class ChuNhat {
    double rong;
    double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public ChuNhat() {

    }

    double getChuVi() {
        return (rong + dai) * 2;
    }

    double getDienTich() {
        return rong * dai;
    }

    void xuat() {
        System.out.println("Chiều dài: " + dai);
        System.out.println("Chiều rộng: " + rong);
        System.out.println("Chu vi: " + getChuVi());
        System.out.println("Diện tích: " + getDienTich());
    }
}

class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super.rong = canh;
        super.dai = canh;
    }

    void xuat() {
        System.out.println("Cạnh: " + super.rong);
        System.out.println("Chu vi: " + getChuVi());
        System.out.println("Diện tích: " + getDienTich());
    }
}

class Main {
    public static void main(String[] args) {
        ChuNhat cn1 = new ChuNhat(4, 5);
        cn1.xuat();
        ChuNhat cn2 = new ChuNhat(6, 12);
        cn2.xuat();
        ChuNhat vu = new Vuong(6);
        vu.xuat();
    }
}
