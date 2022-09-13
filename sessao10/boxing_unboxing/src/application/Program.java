package application;

public class Program {
    public static void main(String[] args) {
        System.out.println("Boxing");

        int  x= 20;

        Object obj = x;
        System.out.println(obj);
        int y = (int) obj;

        System.out.println(y);

        int xx = 20;

        Integer obj2 = xx;
        System.out.println(obj2);
        int yy = obj2 * 2;
        System.out.println(yy);
    }
}
