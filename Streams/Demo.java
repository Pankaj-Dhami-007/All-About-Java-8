import java.util.Arrays;
import java.util.List;

class Demo{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // count even no 
        // in traditional way

        int count =0;
        for(int i : numbers){
            if(i %2 == 0){
                count++;
            }
        }
        System.out.println(count);
        System.out.println();

        // using stream

        System.out.println(numbers.stream().filter(x-> x% 2 == 0).count());
    }
}