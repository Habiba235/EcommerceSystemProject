package Project1;

public class Order {

    private int customerId;
    private int orderId = 0;
    private float totalPrice;
    private int nProducts;
    private String[] products = new String[nProducts];

    public Order(Cart c3) {
        this.customerId = c3.getCustomerId();
        this.orderId = this.orderId + 1;
        this.totalPrice = (float) c3.getPrice();
        this.nProducts = c3.getnProducts();
        this.products = c3.getProducts();
    }

    public void printOrderInfo() {
        System.out.println("Order ID : " + this.orderId);
        System.out.println("Customer ID : " + this.customerId);
        for (int i = 0; i < this.nProducts; i++) {
            System.out.println(this.products[i]);
        }

        System.out.println("your Total price : " + this.totalPrice);
    }
}

