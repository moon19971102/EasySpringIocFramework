package org.example.myspring.entity;


import lombok.Data;
import org.example.myspring.Component;
import org.example.myspring.Value;

@Data
@Component("myOrder")
public class Order {
    @Value("xxx123")
    private String orderId;
    @Value("1000.5")
    private Float price;
}
