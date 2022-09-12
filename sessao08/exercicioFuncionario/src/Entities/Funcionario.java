package Entities;

public class Funcionario {
    public String name;
    public double grossSalary, tax;

    public double vetSalary() {
        return  grossSalary -  tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary = this.grossSalary + (this.grossSalary * (percentage/100.00));
    }


    public String toString() {
        return name+" , $ "+String.format("%.2f",vetSalary());
    }
}
