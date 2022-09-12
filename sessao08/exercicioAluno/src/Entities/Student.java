package Entities;

public class Student {

    public String name;
    public double notaPrimeiroSemestre, notaSegundoSemestre, notaTerceiroSemestre, total;

    public void verificarSePassou() {
        double total = notaPrimeiroSemestre + notaSegundoSemestre + notaTerceiroSemestre;
        System.out.printf("FINAL GRADE = %.2f%n",total);
        if ( total >= 60.00 ) {
            System.out.println("PASS");
        } else {
            System.out.printf("FAILED%nMISSING %.2f POINTS", 60.000-total);
        }
    }

    public String toStrig() {
        return name + " , " + notaPrimeiroSemestre + " , " + notaSegundoSemestre + " , " + notaTerceiroSemestre;
    }
}
