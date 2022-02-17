package com.example.warehouseservice;
public class Warehouse {
    private final int warehouse_no;
    private final String city;

    public Warehouse(final int warehouse_no,  final String city) {
        this.warehouse_no = warehouse_no;
        this.city = city;
    }

    public int getId() {
        return warehouse_no;
    }

    public String getCity() {
        return city;
    }
}