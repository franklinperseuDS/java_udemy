import java.util.Scanner;

public class entradaDeDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        String x2;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        sc.nextLine();
        x2 = sc.nextLine();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(x2);

        sc.close();
    }
}
