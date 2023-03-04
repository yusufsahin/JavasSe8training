import com.example.domain.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e= new Employee();
       // e.empId=2;

        e.setEmpId(2);
        e.setName("John  Doe");
        e.setSsn("123456789");
        e.setSalary("500000");

        System.out.println(e.getName());

        Employee e2= new Employee(3,"Jane Doe","987654321","900000");

        System.out.println(e2.getSalary());

    }
}