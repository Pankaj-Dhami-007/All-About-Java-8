import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3);
     // 1. collect
         // 1. collect
        //list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. forEach
        list.stream().forEach(x -> System.out.println(x));


        // 3. reduce : Combines elements to produce a single result
        //Optional<Integer> optionalInteger1 = list.stream().reduce((x, y) -> x+y);
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        // 4. count

        // 5. anyMatch, allMatch, noneMatch

        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);


         // 6. findFirst, findAny
         System.out.println(list.stream().findFirst().get());
         System.out.println(list.stream().findAny().get());// koi bhi laake dedo 


           // 7. toArray()

        Object[] array = Stream.of(1, 2, 3).toArray();

         // 8. min / max
        System.out.println("max: " + Stream.of(2, 44, 69).max((o1, o2) -> o2 - o1));
        System.out.println("min: " + Stream.of(2, 44, 69).min(Comparator.naturalOrder()));




          // Example: Filtering and Collecting Names
          List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
          names.stream().filter(x-> x.length() > 3).collect(Collectors.toList()).forEach(System.out :: println);

          // Example: Squaring and Sorting Numbers
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6);
        numbers.stream().map(x-> x*x).sorted().toList().forEach(System.out :: println);

        // Example: Summing Values
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        //System.out.println(integers.stream().reduce((x, y)-> x+y).get());
        System.out.println(integers.stream().reduce(Integer::sum).get());


         // Example:  Counting Occurrences of a Character
         String sentence = "Hello world";
         System.out.println(sentence.chars().filter(x -> x == 'l').count());// ans = 3
    }
}
