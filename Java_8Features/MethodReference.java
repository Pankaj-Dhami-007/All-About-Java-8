
import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        for(String s: students){
            System.out.println(s);
        }
System.out.println();
        students.forEach(x-> System.out.println(x));// lamda expression
        System.out.println();

         students.forEach(System.out :: println);  // method reference -- concise way 
System.out.println();

// Constructor reference

List<String> names = Arrays.asList("A", "B","C");
//List<MobilePhone> mobilePhonesList = names.stream().map(x-> new MobilePhone(x)).toList();

//Use constructor reference
List<MobilePhone> mobilePhonesList = names.stream().map(MobilePhone::new ).toList();
// MobilePhone::new   - refers constructor
    }
}

class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}
