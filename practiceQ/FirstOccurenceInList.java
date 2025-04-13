import java.util.Arrays;
import java.util.List;

public class FirstOccurenceInList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Bob", "David");
        names.stream().findFirst().ifPresent(System.out :: println);
    }
}
