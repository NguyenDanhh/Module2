package CaseStudy.model;

public abstract class Facility {
    private String tenDichVu;
    private double dienTich;
    private String gia;
    private int nguoiToiDa;
    private String kieuThue;

    public Facility() {
    }

    public Facility(String name, double area, String price, int people, String rentalType) {
        this.tenDichVu = name;
        this.dienTich = area;
        this.gia = price;
        this.nguoiToiDa = people;
        this.kieuThue = rentalType;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getNguoiToiDa() {
        return nguoiToiDa;
    }

    public void setNguoiToiDa(int nguoiToiDa) {
        this.nguoiToiDa = nguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Tên dịch vụ = " + tenDichVu + '\'' +
                ", Diện tích = " + dienTich +
                ", Giá = " + gia + '\'' +
                ", Người Tối Đa = " + nguoiToiDa +
                ", Kiểu thuê = " + kieuThue + '\'';
    }
}
