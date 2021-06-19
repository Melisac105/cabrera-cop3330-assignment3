package ex44.util;

import java.io.FileNotFoundException;

public class Process {
    private static Products.Product getProduct(String productName, Products products) {
        //iterate each product in the list until find product
        for (Products.Product product : products.getProducts()) {
            //if product is found, return product name
            if (product.name.contains(productName)) {
                return product;
            }
        }
        return null;
    }

    public static void process() throws FileNotFoundException {
        String json = Files.getFileContent();
        Products products = Files.parseJson(json);

        //iterate until product is found
        while (true) {
            String productName = UsrInput.getProductName();
            Products.Product product = Process.getProduct(productName, products);

            if (product != null) {
                System.out.printf("Name: %s\nPrice: $%.2f\nQuantity on hand: %d\n",
                        product.getName(),
                        product.getPrice(),
                        product.getQuantity());
                break;
            }
            System.out.println("Sorry, that product was not found in our inventory.");
        }
    }

}
