package org.example.myspring.entity;


import lombok.Data;
import org.example.myspring.Autowired;
import org.example.myspring.Component;
import org.example.myspring.Qualifier;
import org.example.myspring.Value;

@Data
@Component
public class Account {
    @Value("1")
    private Integer id;
    @Value("张三")
    private String name;
    @Value("22")
    private Integer age;
    @Autowired
    @Qualifier("myOrder")
    private Order order;
}
