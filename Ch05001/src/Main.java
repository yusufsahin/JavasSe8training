import com.example.Islem;
import com.example.com.example.enums.DayOfWeek;
import com.example.com.example.nested.Outer;
import com.example.draw.Rectangle;
import com.example.draw.Shape;

public class Main {
    public static void main(String[] args) {
        Rectangle r= new Rectangle(10,15);

        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());

        Shape s= new Rectangle(10,40);
        System.out.println(s.getArea());

       // Outer o= new Outer();
       // Outer.Inner a=o.new Inner();
        //System.out.println(a.printMessage());

        DayOfWeek today = DayOfWeek.MONDAY;
        DayOfWeek nextDay = today.getNextDay();
        System.out.println("Today is " + today.getEng() + ", and tomorrow is " + nextDay.getEng());
        System.out.println("Bugün  " + today.getTr() + ", ve  yarın " + nextDay.getTr()); // prints "Today is MONDAY, and tomorrow is TUESDAY");


        Islem.Operation topla= ( a,b)->a*b;
        int result= topla.topla(5,6);
        System.out.println(result);

    }
}