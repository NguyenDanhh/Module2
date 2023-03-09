package ss17.baitap.ProductManager.model;

public class Product {
    private String id;
    private String nameProduct;
    private String dateOfManufacture;
    private String color;

    public Product() {
    }

    public Product(String id, String nameProduct, String dateOfManufacture, String color) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.dateOfManufacture = dateOfManufacture;
        this.color = color;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sản phẩm {" +
                "mã sản phẩm = " + id +
                ", Tên sản phẩm ='" + nameProduct + '\'' +
                ", Ngày sản xuất ='" + dateOfManufacture + '\'' +
                ", màu ='" + color + '\'' +
                '}';
    }
}
