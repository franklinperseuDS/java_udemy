package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/YYYY HH:mm:SS");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date date = sdf1.parse(sc.nextLine());
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String orderStatus = sc.nextLine();
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        Order order = new Order( new Date(),OrderStatus.valueOf(orderStatus),new Client(name,email,date));

        for (int i = 1 ; i <= n; i++) {
            sc.nextLine();
            System.out.println("Enter #"+i+" item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            order.addItem(new OrderItem(quantity,productPrice,
                        new Product(productName,productPrice)));

        }

        sc.close();

        System.out.println("ORDER SUMMARY:");
        System.out.println(order);
    }
}
