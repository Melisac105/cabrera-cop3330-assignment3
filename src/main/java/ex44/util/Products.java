package ex44.util;

import java.util.ArrayList;

public class Products {

    public class Product {
        String name;
        double price;
        int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    private ArrayList<Product> products;

    public Products(ArrayList<Product> products) {
        this.products = products;
    }

    public  ArrayList<Product> getProducts() {
        return  products;
    }
}
