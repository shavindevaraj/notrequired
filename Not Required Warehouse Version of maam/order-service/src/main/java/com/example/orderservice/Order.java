package com.example.orderservice;
public class Order {
    private final int order_no;
    private final int warehouse_no;
    private final String ship_date;

    public Order(final int order_no, final int warehouse_no, final String ship_date) {
        this.order_no = order_no;
        this.warehouse_no = warehouse_no;
        this.ship_date = ship_date;
    }

    public int getId() {
        return order_no;
    }

    public int getWarehouseId() {
        return warehouse_no;
    }

    public String getDate() {
        return ship_date;
    }
}