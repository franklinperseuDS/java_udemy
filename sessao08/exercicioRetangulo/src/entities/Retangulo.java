package entities;

public class Retangulo {
    public double width, height;


    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2.0 * (height + width);
    }

    public double diagonal(){
        double total = width * width + height * height;
        return Math.sqrt(total);
    }
}
