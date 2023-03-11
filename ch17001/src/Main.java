import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees= Arrays.asList(
           new Employee(1,"John","Doe",20000,"Sales"),
           new Employee(2,"Jane","Doe",50000,"Manager"),
           new Employee(3,"Frank","Doe",70000,"Manager")
        );

        String searchname="Jane";
        Employee employee= employees.parallelStream()
                .filter(e->searchname.equals(e.getFirstName()))
                .findAny()
                .orElse(null);

        System.out.println("Employee found "+employee.getFirstName());
/*
        String search="Manager";

        double totalSalary = employees.parallelStream()
                .filter(e->search.equals(e.getPosition()))
                .mapToDouble(Employee::getSalary)
                .sum();



        System.out.println("Total Salary :"+totalSalary);

        /*


        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8);

        int sum=numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum : "+sum);
*/
    }
}