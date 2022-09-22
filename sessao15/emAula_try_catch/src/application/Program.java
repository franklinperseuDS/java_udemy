package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        System.out.println("Start  program");
        method1();

        System.out.println("Finish program");
    }

    public static void method1(){
        System.out.println("***Start method 01 ****");
        method2();
        System.out.println("** Finish method 01 **");

    }

    public static void method2(){
        System.out.println("***Start method 02 ****");
        Scanner sc = new Scanner(System.in);
        try {

            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

            sc.close();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position!!!");
            e.getMessage();
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }finally {
            System.out.println("***Finish method 02 ****");
        }
    }
}
