package com.example.coffeeOrder;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {

    private final List<CoffeeOrder> orders = new ArrayList<>();
    public CoffeeOrder placeOrder(CoffeeOrder order) {
        order.setId(CoffeeOrder.getNextId());
        orders.add(order);
        return order;
    }

    public List<CoffeeOrder> getAllOrders() {
        return orders;
    }
}