package CaseStudy.model;

public class Customer extends Person{
    private int maKhachHang ;
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(String ten, int cMND, String ngaySinh, String gioiTinh, int sDT, String email, int maKhachHang, String loaiKhach, String diaChi) {
        super(ten, cMND, ngaySinh, gioiTinh, sDT, email);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "maKhachHang=" + maKhachHang +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
