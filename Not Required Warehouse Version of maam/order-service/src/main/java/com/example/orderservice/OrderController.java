package com.example.orderservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;
@RequestMapping("/orders")
@RestController
public class OrderController {
    private final List<Order> orders = Arrays.asList(
            new Order(1, 1, "1-1-21"),
            new Order(2, 1, "2-2-21"),
            new Order(3, 2, "3-3-21"),
            new Order(4, 1, "4-4-21"),
            new Order(5, 2, "5-5-21"));

    @GetMapping
    public List<Order> getAllOrders() {
        return orders;
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        return orders.stream()
                     .filter(order -> order.getId() == id)
                     .findFirst()
                     .orElseThrow(IllegalArgumentException::new);
    }
}