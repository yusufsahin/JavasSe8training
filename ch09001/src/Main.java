import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva"));

        // create a predicate to filter names starting with 'A'
        Predicate<String> startsWithAPredicate = name -> name.startsWith("A");

        // use the predicate to filter the list
        List<String> filteredNames = names.stream().filter(startsWithAPredicate).collect(Collectors.toList());

        // print the filtered list
        System.out.println(filteredNames);
        System.out.println("---");
            /******* */

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // create a consumer to print each number
        Consumer<Integer> printNumberConsumer = number -> System.out.print(number + " ");

        // use the consumer to print each number in the list
        numbers.forEach(printNumberConsumer);
        System.out.println("---");
        /******* */

        Function<String, Integer> stringToIntFunction = str -> Integer.parseInt(str);

        // use the function to convert a string to an integer
        int result = stringToIntFunction.apply("123");

        // print the result
        System.out.println(result);
        /************ */

        Supplier<Double> randomNumberSupplier = () -> Math.random();

        // use the supplier to generate a random number
        double randomNumber = randomNumberSupplier.get();

        // print the random number
        System.out.println(randomNumber);

        /****/

        ToDoubleFunction<Integer> squareFunction = num -> num * 1.18;

        // use the function to get the square of a number
        double result1 = squareFunction.applyAsDouble(5);

        // print the result
        System.out.println(result1);

        /***/

        DoubleFunction<String> doubleToStringFunction = d -> Double.toString(d);

        // use the function to convert a double to a string
        String result2 = doubleToStringFunction.apply(3.14159);

        // print the result



    }
}