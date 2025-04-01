
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {
        Consumer<Integer> consume = x-> System.out.println(x);
        consume.accept(3333);

        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x->{
            for(int i : x){
                System.out.println(i);
            }
        };
        printList.accept(list);
    }
}
