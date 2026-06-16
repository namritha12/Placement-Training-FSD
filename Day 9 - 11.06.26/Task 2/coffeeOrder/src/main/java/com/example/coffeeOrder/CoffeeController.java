package com.example.coffeeOrder;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/coffee")
public class CoffeeController {
    private final CoffeeService service;
    public CoffeeController(CoffeeService service) {
        this.service = service;
    }
    @PostMapping
    public CoffeeOrder placeOrder(@RequestBody CoffeeOrder order) {
        return service.placeOrder(order);
    }
    @GetMapping
    public List<CoffeeOrder> getAllOrders() {
        return service.getAllOrders();
    }
}