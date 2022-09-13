package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
//        Lista de numeros inteiros
//        lembrete não aceita tipos primitivos
//      generics quando tu quer uma LISTA com INTEIROS ;
        List<String> list = /* instanciar a lista */ new ArrayList<>();

        list.add("Maria");
        list.add("Alec");
        list.add("Bob");
        list.add("anna");

        for (String x: list ) {
            System.out.println(x);

        }



    }
}
