import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        /*
        // create a list of doubles
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 4.0, 9.0, 16.0, 25.0));

        // create a Function to get the square root of a number
        Function<Double, Double> squareRootFunction = num -> Math.sqrt(num);

        // use the function to transform the list of doubles into a list of their square roots
        List<Double> squareRoots = mapList(numbers, squareRootFunction);

        // print the result
        System.out.println("Square roots of numbers: " + squareRoots);

        /****/
        /*
        BiPredicate<String, String> equalStringsPredicate = (str1, str2) -> str1.equals(str2);

        // use the predicate to check if two strings are equal
        boolean result = equalStringsPredicate.test("hello", "hello");

        // print the result
        System.out.println(result);

        UnaryOperator<Integer> incrementOperator = num -> num + 1;

        // use the operator to increment a number
        int result1 = incrementOperator.apply(5);

        // print the result
        System.out.println(result1);
*/

        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        // create a UnaryOperator to convert a string to uppercase
        UnaryOperator<String> uppercaseOperator = str -> str.toUpperCase();

        // use the operator to convert the list of strings to uppercase
        List<String> uppercaseWords = mapList(words, uppercaseOperator);

        // print the result
        System.out.println("Uppercase words: " + uppercaseWords);

    }

    public static <T> List<T> mapList(List<T> list, UnaryOperator<T> operator) {
        List<T> mappedList = new ArrayList<>();

        for (T item : list) {
            T mappedItem = operator.apply(item);
            mappedList.add(mappedItem);
        }

        return mappedList;
    }
/*
    public static <T, R> List<R> mapList(List<T> list, Function<T, R> function) {
        List<R> mappedList = new ArrayList<>();

        for (T item : list) {
            R mappedItem = function.apply(item);
            mappedList.add(mappedItem);
        }

        return mappedList;
    }*/
}