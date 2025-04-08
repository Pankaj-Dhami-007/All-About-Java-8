
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Order{
    String customerName;
    String message;
    public Order(String customerName, String message) {
        this.customerName = customerName;
        this.message = message;
    }
    
}

public class ConsumerEx_2 {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Amit", "amit@example.com"),
            new Order("Riya", "riya@example.com"),
            new Order("Vikram", "vikram@example.com")

        );

        Consumer<Order> sendMsg = order-> System.out.println(order.customerName+" "+order.message);
        orders.forEach(sendMsg);
        System.out.println();

        // Anonymous inner class implementation of Consumer
        orders.forEach(new Consumer<Order>() {
            @Override
            public void accept(Order order) {
                
                System.out.println(order.customerName + " " + order.message);
            }
        });
    }
}
