package com.rozetka.enums;

import com.rozetka.models.Customer;

public enum Customers {
    TEST_USER(Customer.newBuilder()
            .withEmail("ivanenkozanna1@gmail.com")
            .withPassword("Passw0rd")
            .build());

    private final Customer customer;

    Customers(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
