package project1;
import java.util.Scanner;

public class Cart {

    Scanner in = new Scanner(System.in);
    private int customerId;
    private int nProducts;
    private String[] products = new String[nProducts];
    private float price = 0;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        if (customerId > 0) {
            this.customerId = customerId;
        } else {
            this.customerId = 0;
        }
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        if (nProducts > 0) {
            this.nProducts = nProducts;
        } else {
            this.nProducts = 0;
        }
    }

    public void setProducts(String[] products) {
        for (int i = 0; i < products.length; i++) {
            int n = 0;
            boolean flag = false;
            do {
                System.out.println("Which product would you like to add? 1- Smartphone 2- T-shirt 3- OOP");
                n = in.nextInt();
                switch (n) {
                    case 1:
                        products[i] = "Smartphone - $599.99";
                        flag = true;
                        break;
                    case 2:
                        products[i] = "T-shirt - $19.99";
                        flag = true;
                        break;
                    case 3:
                        products[i] = "OOP - $39.99";
                        flag = true;
                        break;
                    default:
                        System.out.println("This product isn't exist, please try again.");
                        break;
                }
            } while (!flag);
        }
    }

    public String[] addProduct(String[] products) {
        for (int i = 0; i < products.length; i++) {
            int n = 0;
            boolean flag = false;
            do {
                System.out.println("Which product would you like to add? 1- Smartphone 2- T-shirt 3- OOP");
                n = in.nextInt();
                switch (n) {
                    case 1:
                        this.products[i] = "Smartphone - $599.99";
                        flag = true;
                        break;
                    case 2:
                        this.products[i] = "T-shirt - $19.99";
                        flag = true;
                        break;
                    case 3:
                        this.products[i] = "OOP - $39.99";
                        flag = true;
                        break;
                    default:
                        System.out.println("This product isn't exist, please try again.");
                        break;
                }
            } while (!flag);
        }
        return this.products;
    }

    public String[] getProducts() {
        return products;
    }

    public double getPrice() {
        return price;
    }

    public String[] removeProduct(int removeIndex) {
        if (removeIndex < 0 || removeIndex >= this.products.length) {
            return this.products;
        }

        float removedPrice = 0;
        String removedProduct = this.products[removeIndex];

        if ("Smartphone - $599.99".equals(removedProduct)) {
            removedPrice = 599.99f;
        } else if ("T-shirt - $19.99".equals(removedProduct)) {
            removedPrice = 19.99f;
        } else if ("OOP - $39.99".equals(removedProduct)) {
            removedPrice = 39.99f;
        }

        String[] newProducts = new String[this.products.length - 1];
        int newIndex = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (i == removeIndex) {
                continue;
            }

            newProducts[newIndex] = this.products[i];
            newIndex++;
        }

        this.products = newProducts;
        this.price -= removedPrice;

        return newProducts;
    }

//    public void removeProduct(int num) {
//        String[] newproducts = new String[this.nProducts];
//        for (int i = 0; i < this.products.length; i++) {
//            if (i == num ) {
//                for (int j = 0; j < newproducts.length; j++) {
//                    this.products[j] = newproducts[i];}
//            }
//        }
//        this.nProducts--;
//        this.products = newproducts;
//    }
//    public void removeProduct(int num){
//       for(int i = 0 ; i < this.nProducts; i++){
//         if(products[i]==products[num-1] ){
//             products[i]=null;
//            break;     
//        }else
//               System.out.println("Not Exist");
//       }
//    }
    public float calculatePrice() {
        for (String product : this.products) {
            if ("Smartphone - $599.99".equals(product)) {
                this.price += 599.99;
            } else if ("T-shirt - $19.99".equals(product)) {
                this.price += 19.99;
            } else {
                this.price += 39.99;
            }
        }
        return this.price;
    }

    public boolean placeOrder(int ans) {
        if (ans == 1) {
            return true;
        } else {
            return false;
        }

    }

    public Cart(int customerId, int nProducts) {
        this.customerId = customerId;
        this.nProducts = nProducts;
        this.products = new String[this.nProducts];
    }

    public Cart() {
        this.customerId = 0;
        this.nProducts = 0;
    }

}

