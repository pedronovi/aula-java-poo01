package applications;




import entities.Product;


import java.util.Locale;
import java.util.Scanner;

public class applications {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");

        int quantityadd = sc.nextInt();
        product.addProducts(quantityadd);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");

        int quantityremove = sc.nextInt();
        product.removeProducts(quantityremove);
        System.out.println();
        System.out.println();
        System.out.println("Updated data: " + product);




      sc.close();
    }
}
