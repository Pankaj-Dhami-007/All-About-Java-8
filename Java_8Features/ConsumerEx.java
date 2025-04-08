
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

/*
 * Consumer<T> 
 * --> is a functional interface that represents an operation   that  takes a single input argument and returns no result.
 * 
 * "Hey, take this input and do something with it (but don’t return anything)."
 * 
 * 
 */
