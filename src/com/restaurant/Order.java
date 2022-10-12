package com.restaurant;

import java.util.Date;
import java.util.List;

public class Order {

    private long orderId;
    private double totalAmount;
    private Vendor vendor;
    private Customer customer;
    private String delivery_address;
    private List<OrderMenuItem> MenuItem;
    private Date orderDate;
    private String orderStatus;

    public long orderId() {
        return orderId;

    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public com.restaurant.Vendor getVendor() {
        return vendor;
    }

    public void setVendor(com.restaurant.Vendor vendor) {
        this.vendor = vendor;
    }

    public com.restaurant.Customer getCustomer() {
        return customer;
    }

    public void setCustomer(com.restaurant.Customer customer) {
        this.customer = customer;
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public List<OrderMenuItem> getMenuItem() {
        return MenuItem;
    }

    public void setMenuItem(List<OrderMenuItem> menuItem) {
        MenuItem = menuItem;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

}
