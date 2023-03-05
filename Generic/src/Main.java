import basic.CacheAny;
import basic.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Charlie", "Doe"));
        students.add(new Student(1, "Alice", "Doe"));
        students.add(new Student(2, "Bob", "Doe"));

        Collections.sort(students); // sort by ID using Comparable

        for (Student student : students) {
            System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getLastName());
        }

        Comparator<Student> lastNameComparator = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getLastName().compareTo(s2.getLastName());
            }
        };

        Collections.sort(students, lastNameComparator); // sort by last name using Comparator

        for (Student student : students) {
            System.out.println(student.getLastName() + ", " + student.getFirstName() + " (" + student.getId() + ")");
        }

      //  CacheAny<String> cs= new CacheAny<String>();

       // cs.add("Test");

        //System.out.println(cs.get());
/*
        Student student1= new Student(1,"John","Doe");

        Student student2= new Student(2,"Jane","Doe");

        Student student3= new Student(3,"James","Doe");

        List<Student> department= new L;

        department.add(student1);
        department.add(student2);
        department.add(student3);

        Collections.sort(Collections.unmodifiableList(department));

        //System.out.println(department.get(0).getFirstName());
        /*
        for (Student student : department) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
            System.out.println("-");
        }
*/
        /*
        TreeSet<Integer> numbers=new TreeSet<>();

        numbers.add(4);
        numbers.add(1);
        numbers.add(6);
        numbers.add(2);
/*
        for (int number : numbers) {
            System.out.println(number);
        }
*/
        /*
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 10);
        scores.put("Bob", 20);
        scores.put("Charlie", 30);
/*
        System.out.println("Bob's score is " + scores.get("Bob"));

        for (String name : scores.keySet()) {
            System.out.println(name + ": " + scores.get(name));
        } */
/*
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("A");
        deque.addLast("B");
        deque.addLast("C");
        deque.addFirst("D");

        System.out.println(deque.peekFirst()); // prints "D"
        System.out.println(deque.peekLast()); // prints "C"

        while (!deque.isEmpty()) {
            System.out.println(deque.removeFirst());
        }
*/
    }
}