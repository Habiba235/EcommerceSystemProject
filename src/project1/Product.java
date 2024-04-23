package project1;

public class Product {

    protected int productId;
    protected String name;
    protected float price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        if (productId > 0) {
            this.productId = productId;
        } else {
            this.productId = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.0f;
        }
    }

    public Product(int productId, String name, float price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public Product() {
        this.productId = 0;
        this.name = null;
        this.price = 0.0f;
    }

}
