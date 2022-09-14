package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
//        Lista de numeros inteiros
//        lembrete não aceita tipos primitivos
//      generics quando tu quer uma LISTA com INTEIROS ;
        List<String> list = /* instanciar a lista */ new ArrayList<>();

        list.add("Maria");
        list.add("Alec");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println("Tamanho da lista : "+ list.size());

        for (String x: list ) {
            System.out.println(x);
        }

        System.out.println();
        System.out.println("Remover Anna");
        list.remove("Anna");
        for (String x: list ) {
            System.out.println(x);
        }


        System.out.println();
        System.out.println("Remover na posição 1");
        list.remove(1);
        for (String x: list ) {
            System.out.println(x);
        }

        System.out.println();
        System.out.println("Remover com predicado");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x: list ) {
            System.out.println(x);
        }

        System.out.println("-----------------------------------------");
        System.out.println("Index of Bob: "+ list.indexOf("Bob"));;
        System.out.println("Index of Anna: "+ list.indexOf("Anna"));;
        System.out.println("Caso não exista na lista o index = -1");


        list.add("Maria");
        list.add("Alec");
        list.add("Anna");
        list.add(2, "Marco");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println("Lista recebendo uma lista filtrada");
        for (String x: result ) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        System.out.println("Encontrar o primeiro elemento que atenda o predicado");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
