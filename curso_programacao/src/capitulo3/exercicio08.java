package capitulo3;
import java.util.Scanner;
public class exercicio08 {
    public static void main(String[] args) {
        System.out.println("Exercicio 08");
        System.out.println("Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e\n" +
                "mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.");

        Scanner sc = new Scanner(System.in);
        double salario;
        System.out.println("Digite o Valor do salário a ser calculado o imposto:");
        salario = sc.nextDouble();

        if( 0.0 <= salario && salario <= 2000.0){
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            System.out.printf("%.2f",(salario-2000.00) * 0.08);
        } else if (salario <= 4500.00) {

            System.out.printf("%.2f", (salario - 3000.0) * 0.18 + 1000.0*0.08);
        }else {
            System.out.printf("%.2f",(salario-4500.00) * 0.28 + 1500.0* 0.18 + 1000.0 * 0.08);
        }

        sc.close();
    }
}
