package sessao06.exercicio;

import java.util.Scanner;

public class exercicioWhile03 {
    public static void main(String[] args) {
        System.out.println("Exercicio While 03");
        System.out.println("Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva\n" +
                "um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel\n" +
                "4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até\n" +
                "que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a\n" +
                "mensagem: \"MUITO OBRIGADO\" e a quantidade de clientes que abasteceram cada tipo de combustível");
    Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tipo de combustivel : \n" +
                "1. Alcool\n" +
                "2. Gasolina\n" +
                "3. Diesel\n" +
                "4. Fim");
        int alcool =0;
        int gasolina = 0;
        int diesel = 0;
        int desconhecido = 0;
        int tipo = sc.nextInt();

        while(tipo != 4){
            if(tipo == 1 ){
                alcool += 1;
            } else if (tipo == 2) {
                gasolina += 1;
            }else if( tipo == 3) {
                diesel += 1;
            }else{
                desconhecido++;
            }
            tipo = sc.nextInt();
        }
        System.out.printf("MUITO OBRIGADO\nAlcool : %d \nGasolina: %d\nDiesel: %d",alcool,gasolina,diesel);
        System.out.println(desconhecido);
        sc.close();
    }
}
