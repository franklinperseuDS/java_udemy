package entities;

public class Individual extends TaxPayer{
        public Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax(){
        double tax = 0.0;
        if (anualIncome < 20000.0) {
            tax = anualIncome * 0.15 - healthExpenditures * 0.5;
        }else {
            tax = anualIncome * 0.25 - healthExpenditures * 0.5;
        }
        return tax;
    }
}
