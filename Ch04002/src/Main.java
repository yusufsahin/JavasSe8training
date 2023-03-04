import com.example.MySingleton;
import com.example.domain.*;

public class Main {
    public static void main(String[] args) {
        //Employee e = new Employee(101, "Jim Smith","011-12-2345",100000);

        //Manager m= new Manager(102,"Joan Kern", "012-23-4567", 110000, "Marketing");

        //System.out.println(e.getDetails());
        //System.out.println(m.getDetails());

        Manager e= new Manager(102,"Joan Kern", "012-23-4567", 110000, "Marketing");
        Director d= new Director(105,"Jon Doe","555555",2500000,"VP",true);
        System.out.println(e.toString());

        System.out.println(e.getDetails());

        System.out.println(GoodBonus.getBonusPercent(e));
        System.out.println(GoodBonus.getBonusPercent(d));

      Employee x= new Employee(1,"Sue","555555556",1000);

      Employee y=x;

      Employee z= new Employee(1,"Sue","555555556",1000);
      System.out.println(x.equals(y));

      System.out.println(x.equals(z));

      System.out.println(z.hashCode());
        System.out.println(y.hashCode());
        System.out.println(d.hashCode());



        Statistics s= new Statistics();
        System.out.println(s.average(4,7));
        System.out.println(s.average(5,8,9));
        System.out.println(s.average(1,2,3,4));

        MySingleton singleton1= MySingleton.getInstance();

        MySingleton singleton2=MySingleton.getInstance();

        if(singleton2.equals(singleton2))
        {
            System.out.println("Tek Instance");
        }
    }
}