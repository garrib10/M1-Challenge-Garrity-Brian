package com.company;

import java.util.Objects;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;


    private boolean isMember;

    private  Address billingAddress;
    private  Address shippingAddress;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return phoneNumber == customer.phoneNumber && isMember == customer.isMember && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(billingAddress, customer.billingAddress) && Objects.equals(shippingAddress, customer.shippingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phoneNumber, isMember, billingAddress, shippingAddress);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", isMember=" + isMember +
                ", billingAddress=" + billingAddress +
                ", shippingAddress=" + shippingAddress +
                '}';
    }
}
