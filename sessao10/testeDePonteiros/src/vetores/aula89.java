package vetores;

import java.util.Locale;
import java.util.Scanner;

public class aula89 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Vetores - parte 1");
        System.out.println("Ler um numer N e colocar as alturas em um vetor e calcular a media aritimetica");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i=0 ; i<n; i++) {
                vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for ( int i=0; i<n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT = %.2f",avg);
        sc.close();

    }
}
