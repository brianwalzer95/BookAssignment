package com.example.owner.bookassignment.entity;

/**
 * Created by Owner on 09/04/2018.
 */

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {
    private String name, email, password, paymentDetails, shippingDetails;

    public User() {}

    public User(String name, String email, String password, String paymentDetails, String shippingDetails) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.paymentDetails = paymentDetails;
        this.shippingDetails = shippingDetails;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public String getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(String shippingDetails) {
        this.shippingDetails = shippingDetails;
    }
}