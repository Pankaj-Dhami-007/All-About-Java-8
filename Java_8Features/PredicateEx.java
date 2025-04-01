import java.util.function.Predicate;

class PredicateEx{
    public static void main(String[] args) {
        Predicate<Integer> isEven = x-> x%2 == 0;
        System.out.println(isEven.test(5));
        
        
    }
}