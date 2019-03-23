package product
public class Product {
    private int id;
    private String name;
    private float price;
    private int barcode;

    public Product(int id, String name, float price, int barcode) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getBarcode() {
        return barcode;
    }
}
