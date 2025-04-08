import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
      public static Character firstNonRepeatingChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
      
        return null;
    }
    public static void main(String[] args) {
        
    }
}
