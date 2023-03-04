import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Manager;

public class Main {
    public static void main(String[] args) {

       // Manager manager= new Manager();
       // manager.setName("James Doe");

        //manager.setDepartmentName("Marketing");

        //System.out.println(manager.getDepartmentName());


        Manager m1= new Manager(3,"Frank Doe","53463637637","4000000","Marketing");

        System.out.println(m1.getName()+" "+m1.getDepartmentName());

        m1.riseSalary("5000000");

        System.out.println(m1.getSalary());


        Director d1= new Director(6,"John Doe","876543","10000000","VP");

        d1.setApproveRight("NOK");
        Director d2= new Director(7,"Angel Doe","76678899","11000000","CxO Office","OK");

        System.out.println(d1.getApproveRight());

        System.out.println(d2.getApproveRight());

        d1=d2;
        d2.setApproveRight("Undefined");

        System.out.println(d1.getApproveRight());

        d2.setApproveRight("Tanimsiz");

        System.out.println(d2.getApproveRight());

        d1.setApproveRight("aaaaaaa");

        System.out.println(d2.getApproveRight());


        //System.out.println("Hello world!");

        //Employee e= new Employee();
        ////e.empId=1;
       // e.setEmpId(1);

        //Employee e2= new Employee(2,"John Doe","123456789","400000");

        //System.out.println(e2.getName());
    }
}