import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> objects = new ArrayList<>(Arrays.asList("hello", 123, true));

        // print the list of objects
        System.out.println("Objects: " + objects);

        // create a list of strings
        List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        // print the list of strings
        System.out.println("Strings: " + strings);

        // create a list of integers
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // print the list of integers
        System.out.println("Integers: " + integers);

        // print the sum of integers
        System.out.println("Sum of integers: " + sumList(integers));
    }

    public static double sumList(List<? extends Number> list) {
        double sum = 0;

        for (Number number : list) {
            sum += number.doubleValue();
        }

        return sum;
    }

}