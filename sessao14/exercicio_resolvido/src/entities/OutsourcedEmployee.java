package entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;
    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
        super(name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
