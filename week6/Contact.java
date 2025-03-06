/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.regex.Pattern;

/**
 *
 * @author DELL
 */
class Contact {
    private static int idCounter = 1;
    private int id;
    private String fullName;
    private String firstName;
    private String lastName;
    private String group;
    private String address;
    private String phone;

    public Contact(String fullName, String group, String address, String phone) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        setPhone(phone);
        extractNames(fullName);
    }

    private void extractNames(String fullName) {
        String[] parts = fullName.split(" ", 2);
        if (parts.length == 2) {
            this.firstName = parts[0];
            this.lastName = parts[1];
        } else {
            this.firstName = fullName;
            this.lastName = "";
        }
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (isValidPhone(phone)) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Invalid phone format!");
        }
    }

    private boolean isValidPhone(String phone) {
        String regex = "^(\\d{10}|\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}(\\s*(x|ext)\\s*\\d{4})?)$";
        return Pattern.matches(regex, phone);
    }

    @Override
    public String toString() {
        return String.format("%-5d %-20s %-15s %-15s %-10s %-20s %-15s", id, fullName, firstName, lastName, group, address, phone);
    }
}