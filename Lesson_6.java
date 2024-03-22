import Lesson_6.Order;
import Lesson_6.OrderInputFromConsole;
import Lesson_6.OrderSaveToJson;

public class Lesson_6 {

    public static void main(String[] args) {
        
        System.out.println("Введите заказ:");
        OrderInputFromConsole inputFromConsole = new OrderInputFromConsole();
        Order order = inputFromConsole.inputFromConsole();
        OrderSaveToJson OrderSaveToJson = new OrderSaveToJson(order, "order.json");
        OrderSaveToJson.save();
    }
}
