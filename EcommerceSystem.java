package ecommercesystem;

import java.util.Scanner;

import java.util.Scanner;

public class EcommerceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        ElectronicProduct e = new ElectronicProduct("Smasung", 1, 1, "SmartPhone", 599.9f);
        ClothingProduct c1 = new ClothingProduct("Medium ", " cotton ", 2, "T-shirt ", 19.99f);
        BookProduct p = new BookProduct("O' Reilly ", "X publications ", 3, "OOP", 39.99f);

        System.out.println("Welcome to E-commerce system!");
        System.out.println("Please enter your ID ");
        int id = in.nextInt();
        System.out.println("Please enter your name ");
        String name = in.next();
        System.out.println("Please enter your address ");
        String address = in.next();

        Customer c2 = new Customer(id, name, address);

        System.out.println("How many products you want to add to your cart ? ");
        int num = in.nextInt();
        String[] array = new String[num];
        Cart c3 = new Cart(id, num);
        c3.addProduct(array);
        Order o = new Order(c3);

        System.out.println("your total price is : " + c3.calculatePrice());
        System.out.println("Would you place the order? 1- yes 2- No");
        int ans = in.nextInt();

        if (c3.placeOrder(ans) == true) {
            o.printOrderInfo();
        } else {
            System.out.println(" OrderCanceled ");
        }

    }
}
