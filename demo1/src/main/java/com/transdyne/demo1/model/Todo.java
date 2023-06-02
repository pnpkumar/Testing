package com.transdyne.demo1.model;

public class Todo {
    private int id;
    private String username;
    private String password;
    private String address;
    private String city;
    private String email;
    @Override
    public String toString() {
        return "demo [id=" + id + ", username=" + username + ", password=" + password + ", address=" + address
                + ", city=" + city + ", email=" + email + "]";
    }
   
    public Todo(int id, String username, String password, String address, String city, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.city = city;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


	//Getters, Setters, Constructors, toString, equals and hash code
}

