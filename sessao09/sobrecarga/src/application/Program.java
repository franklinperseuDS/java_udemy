package application;

import entties.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
//        System.out.print("Quantity in stock: ");
//        int quantity = sc.nextInt();

//        Product product = new Product(name,price,quantity);
        Product product = new Product(name,price);
        System.out.println();

        System.out.println("Product data:" +product);

        System.out.println("Enter the number of products to be added in sotck: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: "+ product);

       System.out.println("Enter the number of products to be removed from sotck: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data : "+product);

        sc.close();
    }
}
