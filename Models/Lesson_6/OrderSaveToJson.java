package Lesson_6;

import java.io.FileWriter;
import java.io.IOException;

public class OrderSaveToJson {

    Order order;
    String fileName;

    public OrderSaveToJson(Order order, String fileName) {
        this.order = order;
        this.fileName = fileName;
    }
    
    public void save() {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            String document = "{\n" + 
                                    "\t\"clientName\":\"" + order.getClientName() + "\",\n" +
                                    "\t\"product\":\"" + order.getProduct() + "\",\n" +
                                    "\t\"qnt\":" + order.getQnt() + ",\n" +
                                    "\t\"price\":" + order.getPrice() + "\n" +
                                "}";
            writer.write(document);
            writer.flush();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
