
import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {
        Supplier<String> giveHelloWorld = () -> "hello world";
        System.out.println(giveHelloWorld.get());
    }
}
