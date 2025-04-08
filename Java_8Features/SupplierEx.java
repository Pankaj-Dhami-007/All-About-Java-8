
import java.util.function.Supplier;
//Represents a supplier of results — it takes no input and returns a result.
public class SupplierEx {
    public static void main(String[] args) {
        Supplier<String> giveHelloWorld = () -> "hello world";
        System.out.println(giveHelloWorld.get());
    }
}

/*
 * Code Example: Supplier to Generate Default Username/OTP
 */
