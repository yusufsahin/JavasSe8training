import ch008.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Student student1= new Student.Builder(1,"John","Doe")
                .age(25)
                .email("john.doe@example.com")
                .phoneNumber("333-2222")
                .build();
        Student student2= new Student.Builder(2,"Jane","Doe")
                .age(22)
                .email("jane.doe@example.com")
                .phoneNumber("333-2277")
                .build();

        Student student3= new Student.Builder(3,"James","Frank")
                .age(28)
                .email("james.frank@example.com")
                .phoneNumber("333-2177")
                .build();

        Student student4= new Student.Builder(4,"Angle","Lee")
                .age(26)
                .email("angle.lee@example.com")
                .phoneNumber("333-2177")
                .build();

        List<Student> students =new ArrayList<>();


        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        List<Student> filteredStudents= students.stream()
                .filter(s->s.getAge()>20 && s.getAge()<26)
                .filter(s->s.getFirstName().equals("Jane"))
                .collect(Collectors.toList());

        for (Student student:filteredStudents)
        {
            System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getLastName() + " " + student.getAge() + " " + student.getEmail() + " " + student.getPhoneNumber());
        }
    }
}