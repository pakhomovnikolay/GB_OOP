package Lesson_6;

import java.util.Scanner;

public class OrderInputFromConsole {

    
    public Order inputFromConsole() {
        Order order = new Order("", "", 0, 0);
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Double.parseDouble(prompt("Price: ")));
        return order;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}
