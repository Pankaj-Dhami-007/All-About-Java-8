
import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = x-> 2*x;
        Function<Integer, Integer> tripleIt = x-> 3*x;
        int res = doubleIt.apply(100);
        System.out.println(res);

        int res1 = doubleIt.andThen(tripleIt).apply(100);
        System.out.println(res1);
    }
}

/*
 * 
 * What is Function<T, R>?
In Java 8, Function<T, R> is a functional interface that represents a function which:

1.takes one argument of type T (input)
2.returns a result of type R (output)




 */
