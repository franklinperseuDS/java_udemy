package Application;

import Entities.Student;
import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano\n" +
                "(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no\n" +
                "ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam\n" +
                "para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para\n" +
                "resolver este problema.");

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Digite o nome: ");
        student.name = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        student.notaPrimeiroSemestre = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        student.notaSegundoSemestre = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        student.notaTerceiroSemestre = sc.nextDouble();


        student.verificarSePassou();

    }
}
