package entities;

public class Pessoa {
    private double height;
    private char genero;

    public Pessoa(double height, char genero) {
        this.height = height;
        this.genero = genero;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
