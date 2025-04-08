import java.util.function.Predicate;
//Represents a boolean-valued function — it takes an input and returns true or false.
class PredicateEx{
    public static void main(String[] args) {
        Predicate<Integer> isEven = x-> x%2 == 0;
        System.out.println(isEven.test(5));
        
        
    }
}

/*
 * Real-Life Example: Check if person is adult
 * 
 * 
 */