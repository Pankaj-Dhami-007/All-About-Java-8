import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }  
}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        // return o1 - o2;
        return o2-o1;
    }

}
class ComparatorExample{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        // System.out.println(list);
        // list.sort(null);//If null is passed, Java uses default comparison (Comparable interface).
        // System.out.println(list);
        // Collections.sort(list);  // Same effect as list.sort(null)

        list.sort(new MyComparator());
        System.out.println(list);

        List<String> words = Arrays.asList("banana","apple", "date");
        //words.sort(null);
        words.sort(new StringLengthComparator());
        System.out.println(words);
    }
}
/*
 * 
 * list.sort((a, b) -> a.compareTo(b));  // Explicit natural order
 * list.sort(Integer::compareTo);  // Cleaner approach
 * list.sort(Comparator.reverseOrder());
// Output: [3, 2, 1]
 */