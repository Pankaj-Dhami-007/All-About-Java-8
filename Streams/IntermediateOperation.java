
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperation {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Akshit","Ram","Shyam","Ghanshyam");
        Stream<String> filteredStream = list.stream().filter(x-> x.startsWith("A"));

        //map
        list.stream().map(x-> x.toUpperCase());
        
    }
}
