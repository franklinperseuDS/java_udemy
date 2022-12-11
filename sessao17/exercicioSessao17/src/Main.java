public class Main {
    public static void main(String[] args) {
        {
            int num = 10;//Integer.parseInt(new Scanner(System.in).nextLine());
            var step = 1;

// TODO: Implemente uma condição onde seja possível reduzir o número até 0:

            while (num > 0)
            {
                if ((num & 1) == 1)
                {
                    step++;
                }
                if( num % 2 == 0){
//                    System.out.printf("Etapa %d) %d é par; divida por 2 e obtenha %d. \n", step,num , num/=2);
                    System.out.println("Etapa "+step+") "+num+" é par; divida por 2 e obtenha "+(num/=2));
                }else {
                    System.out.println("Etapa "+step+") "+num+" é ímpar; subtraia 1 e obtenha "+(num/=2));
                }

                step++;
            }


        }
    }
}