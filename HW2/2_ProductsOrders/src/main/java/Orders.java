import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Orders {

    public static void main(String[] args) throws IOException {//exception handling
        int num_iterations = 100;//iteration counter
        List<Order> orderList = new ArrayList<>();//create order list
        List<Product> productList = new ArrayList<>();//and product list

        Orange orange = new Orange(1, "апельсины", 100, true);
        Apple apple = new Apple(1, "яблоки", 100, "green");

        productList.add(orange);
        productList.add(apple);

        for (int id = 0; id < num_iterations; id++) {
            Delivery_address address = new Delivery_address("Russia", "Moscow", "Polyanka", 6, 4, 1+id);
            Order order = new Order(id, address, productList);
            orderList.add(order);
        }
        ObjectMapper mapper = new ObjectMapper();
        //serialize
        FileWriter fileWriter = new FileWriter("src/order.json");
        mapper.writeValue(fileWriter, orderList);
        //deserialize
        FileReader fileReader = new FileReader("src/order.json");
        orderList = mapper.readValue(fileReader, ArrayList.class);
        System.out.println(orderList.toString());//
    }
}
