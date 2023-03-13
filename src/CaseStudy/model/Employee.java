package CaseStudy.model;

public class Employee extends Person {
    private int maNhanVien;
    private String trinhDo;
    private String viTri;
    private String luong;

    public Employee() {
    }

    public Employee(String ten, int cMND, String ngaySinh, String gioiTinh, int sDT, String email, int maNhanVien, String trinhDo, String viTri, String luong) {
        super(ten, cMND, ngaySinh, gioiTinh, sDT, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "maNhanVien=" + maNhanVien +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong='" + luong + '\'' +
                '}';
    }
}
