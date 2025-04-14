
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Java_8 {

    //Find the sum of all even numbers in a list
    static int findEvenSum(List<Integer> nums){
          return -1; 
    }


    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 55, 53);

        System.out.println("Counts: ");
        System.out.println(nums.stream().count());

        //all element start with 5

        System.out.println("all element start with 5: ");
        nums.stream().filter(num -> num.toString().startsWith("5")).forEach(System.out :: println);


        //duplicate elements in the list

        System.out.println("duplicate elements in the list: ");
        List<Integer> dupList = Arrays.asList(1, 1, 2, 3, 4, 5, 4, 6, 71, 8);
        Set<Integer> set = new HashSet<>();
        dupList.stream().filter(x-> !set.add(x)).forEach(System.out :: println);

        // Max and min no 
        System.out.println("Max and min no ");
        nums.stream().max((a, b) -> a-b).ifPresent(max -> System.out.println(max));

        nums.stream().min((a, b) -> a-b).ifPresent(min -> System.out.println(min));

        List<Integer> nums2 = Arrays.asList(10, 20, 5, 40, 15);

System.out.println("Max and min no Using method reference : ");

nums2.stream()
    .max(Integer::compareTo)
    .ifPresent(max -> System.out.println("Max: " + max));

nums2.stream()
    .min(Integer::compareTo)
    .ifPresent(min -> System.out.println("Min: " + min));


 System.out.println("inc order: ");

 nums2.stream().sorted().forEach(System.out :: println);


 System.out.println("desc order: ");

 nums2.stream().sorted((a, b)-> b-a).forEach(System.out :: println);

System.out.println("desc other way : ");

nums2.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: println);


// check a arr contains duplicates value or not 

int[] arr = {1, 2, 3, 4, 5, 1};
if(Arrays.stream(arr).distinct().count() != arr.length){
    System.out.println(" Arr contains duplicates"); 
}
else{
    System.out.println(" not present duplicates");
}

// square on list elements and filter no greater than 50

nums2.stream().map(x-> x*x).filter(x-> x> 50).forEach(System.out :: println);


// reduce 
    }
}
