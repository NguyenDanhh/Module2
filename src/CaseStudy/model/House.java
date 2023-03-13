package CaseStudy.model;

import java.io.File;

public class House extends Facility {
    private String tieuChuanPhong;
    private int soTang;

    public House() {
    }

    public House(String name, double area, String price, int people, String rentalType, String tieuChuanPhong, int soTang) {
        super(name, area, price, people, rentalType);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                '}';
    }
}

