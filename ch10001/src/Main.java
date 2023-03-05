import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        /*
        Stream.of("Monday", "Tuesday","Wedensday", "Thursday")
      				.filter(s -> s.startsWith("T"))
      				.forEach(s -> System.out.println("Matching Days: " +s));
    */
        /*
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(doubledNumbers);

        List<String> names = Arrays.asList("John", "Alice", "Bob");
        List<String> upperCaseNames = names.stream()
                .peek(System.out::println)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseNames);
*/
      /*  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        boolean anyNegative = numbers.stream()
                .noneMatch(n -> n < 0);

        System.out.println(anyNegative); // Output: true

        boolean allPositive = numbers.stream()
                .allMatch(n -> n < 0);

        System.out.println(allPositive);

        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
        System.out.println(firstEven.get());

/*
        List<String> words = Arrays.asList("apple", "banana", "orange");
        Optional<String> anyWordWithA = words.stream()
                .filter(word -> word.contains("a"))
                .findAny();
        System.out.println(anyWordWithA.get());
  */

        /*
        List<String> words = Arrays.asList("apple", "banana", "orange");

        boolean anyWordWithA = words.stream()
                .anyMatch(word -> word.contains("a"));

        System.out.println(anyWordWithA);
*/
      /*
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 7);

        long count = numbers.stream()
                .count();

        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);

        Optional<Integer> min = numbers.stream()
                .min(Integer::compare);
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(count); // Output: 5
        System.out.println(max.get());   // Output: Optional[8]
        System.out.println(min.get());
        System.out.println(average); // Output: 5.0
        System.out.println(sum);

        List<String> fruits = Arrays.asList("banana", "apple", "pear", "orange");
/*
        List<String> sortedFruits = fruits.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedFruits);
  */
/*
        List<String> sortedFruits = fruits.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());

         System.out.println(sortedFruits);*/

        /*
        List<Person> people = Arrays.asList(

                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35));

        Map<String, Integer> ageByName = people.stream()
                .collect(Collectors.toMap(Person::getName,
                        Person::getAge));

        System.out.println(ageByName);
        */
/*
        List<Person> people = Arrays.asList(new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35),
                new Person("David", 30),
                new Person("Eva", 25));

        Map<Integer, List<Person>> peopleByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        System.out.println(peopleByAge);
*/
/*
        List<String> words = Arrays.asList("apple", "banana", "orange");
        String joinedWords = words.stream()
                .collect(Collectors.joining(", "));

        System.out.println(joinedWords);
        */
/*
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));


        System.out.println(partitionedNumbers);*/
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9));
        List<Integer> flattenedNumbers = numbers.stream()
                .flatMap(List::stream)
                .filter(s->s%2==0)
                .collect(Collectors.toList());

        System.out.println(flattenedNumbers);
    }

}