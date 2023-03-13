package CaseStudy.model;

public abstract class Person {
    private String ten ;
    private int cMND ;
    private String ngaySinh;
    private String gioiTinh;
    private int sDT;
    private String email;

    public Person() {
    }

    public Person(String ten, int cMND, String ngaySinh, String gioiTinh, int sDT, String email) {
        this.ten = ten;
        this.cMND = cMND;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.sDT = sDT;
        this.email = email;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getcMND() {
        return cMND;
    }

    public void setcMND(int cMND) {
        this.cMND = cMND;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getsDT() {
        return sDT;
    }

    public void setsDT(int sDT) {
        this.sDT = sDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ten='" + ten + '\'' +
                ", cMND=" + cMND +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", sDT=" + sDT +
                ", email='" + email + '\'';
    }
}
