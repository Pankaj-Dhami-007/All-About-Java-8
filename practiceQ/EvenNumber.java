import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5,6, 7 ,8,9, 10);
       List<Integer> evenNumbers =  nums.stream().filter(n-> n%2 ==0).collect(Collectors.toList());
       System.out.println(evenNumbers);

       nums.stream().filter(i-> i %2 == 0).forEach(System.out :: println);

       
    }
}
