import java.util.Arrays;
import java.util.List;

public class ComparatorUsingLamda {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana","apple", "date");
        words.sort((a, b)-> a.length() - b.length());
        System.out.println(words);
    }
}
