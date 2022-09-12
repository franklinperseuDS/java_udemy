package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram\n" +
                "no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir\n" +
                "os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou\n" +
                "igual a 6.0 (seis). ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serao digitados?");
        int n = sc.nextInt();

        Student[] student = new Student[n];

        for (int i = 0 ; i < student.length; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n",(i+1));
            String name = sc.nextLine();
            double gradeFirst = sc.nextDouble();
            double gradeSecond = sc.nextDouble();
            student[i] = new Student(name,gradeFirst,gradeSecond);
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0 ; i < student.length; i++) {
                double avg = (student[i].getGradeFirst() + student[i].getGradeSecond() ) / 2;

                if(avg >= 6.0) {
                    System.out.println(student[i].getName());
            }
        }
    }
}
