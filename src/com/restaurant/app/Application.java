package com.restaurant.app;

import com.restaurant.Customer;
import com.restaurant.Order;
import com.restaurant.Vendor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Customer abhinav = new Customer();

        abhinav.setName("Ramesh");
        abhinav.setCity("Nagpur");
        abhinav.setAddress("New Nandanwan, Nagpur");
        abhinav.setState("Maharashtra");
        abhinav.setEmailId("abc@gmail.com");
        abhinav.setPhonenumber(7058317661L);

        System.out.println("Name : "+abhinav.getName());
        System.out.println("City : "+abhinav.getCity());
        System.out.println("Address : "+abhinav.getAddress());
        System.out.println("State : "+abhinav.getState());
        System.out.println("Email ID : "+abhinav.getEmailId());
        System.out.println("Phone Number : "+abhinav.getPhonenumber());


        Vendor haldiram = new Vendor();
        haldiram.setName("Haldiram is veg");
        haldiram.setAddress("Ajni Square,Nagpur");
        haldiram.setCategory("VEG");
        haldiram.setPhonenumber(7058317661L);
        haldiram.setRating(5.0);
        haldiram.setState("Maharashtra");
        haldiram.setCity("Nagpur");

        System.out.println("Vendor details");
        System.out.println("Name : "+haldiram.getName());
        System.out.println("Address : "+haldiram.getAddress());
        System.out.println("Category : "+haldiram.getCategory());
        System.out.println("Phone : "+haldiram.getPhonenumber());
        System.out.println("Rating : "+haldiram.getRating());
        System.out.println("State : "+haldiram.getState());
        System.out.println("City : "+haldiram.getCity());


        Order order = new Order();
        order.setCustomer(abhinav);
        order.setVendor(haldiram);
        order.setTotalAmount(999.0);
        order.setOrderDate(new Date());
        order.setDelivery_address("101 , Civil Lines , Nagpur");

        System.out.println("Order Details : ");
        System.out.println("Total Amount :"+order.getTotalAmount());
        System.out.println("Order Date : "+order.getOrderDate());
        System.out.println("Order Delivery Address : "+order.getDelivery_address());





    }
}
