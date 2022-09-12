package Entities;

public class CurrencyConverter {

    public static double IOF = 1.06;
    public static double ConvertDolarToReal(double currency, double bought){
        return (currency * bought) * IOF;
    }
}
