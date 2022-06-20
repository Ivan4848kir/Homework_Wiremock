import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;
@JsonAutoDetect
public class Order {
    public int id;

    public Delivery_address address;
    public List<Product> productList;

    public Order() {

    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", address=" + address +
                ", productList=" + productList +
                '}';
    }

    public Order(int id, Delivery_address address,List<Product> productList) {
        this.id = id;
        this.address = address;
        this.productList = productList;

    }
}