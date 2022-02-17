package com.example.warehouseservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RequestMapping("/warehouses")
@RestController
public class WarehouseController {
    private List<Warehouse> warehouses = Arrays.asList(
            new Warehouse(1, "Joe Bloggs"),
            new Warehouse(2, "Jane Doe"));
    
    @GetMapping
    public List<Warehouse> getAllWarehouses() {
        return warehouses;
    }
    
    @GetMapping("/{id}")
    public Warehouse getWarehouseById(@PathVariable int id) {
        return warehouses.stream()
                        .filter(warehouse -> warehouse.getId() == id)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
}