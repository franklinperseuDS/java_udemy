package memoria;

public class Primitivos {
    public static void main(String[] args) {
        double x, y;
        x = 10;

        y = x;

        Double xx,yy;

        xx = 10.00;
        yy = xx;
        System.out.printf("x = %.2f  y = %.2f",x,y);
        System.out.printf("xx = %.2f  yy = %.2f",xx,yy);

        x = 12;
        xx = 12.00;
        System.out.printf("x = %.2f  y = %.2f",x,y);
        System.out.printf("xx = %.2f  yy = %.2f",xx,yy);
    }
}
