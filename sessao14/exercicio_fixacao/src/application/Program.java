package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #"+i+" data:");
            sc.nextLine();
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                Product pr = new UsedProduct(name,price,manufactureDate);
                list.add(pr);
            }else if(ch =='i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product pr = new ImportedProduct(name,price,customsFee);
                list.add(pr);
            }else{
                Product pr = new Product(name,price);
                list.add(pr);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }

    }
}
