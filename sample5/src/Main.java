import java.awt.Point;
import java.util.Date;

public class Main{
    public static void main(String[] args) {
        System.out.println(Math.PI);
        Point p = new Point();
        p.x = 1;
        p.y = 3;
        System.out.println(p);

        String a = String.valueOf(10);
        System.out.println(a);

        Integer i = Integer.parseInt("111");
        System.out.println(i);

        Date date = new Date();
        date.getTime();
        date.toString();
        System.out.println(date.toString(date));
    }
}
