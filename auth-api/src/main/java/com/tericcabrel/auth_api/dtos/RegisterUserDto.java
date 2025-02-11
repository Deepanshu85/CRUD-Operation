package com.tericcabrel.auth_api.dtos;


public class RegisterUserDto {
    private String email;

    private String password;

    private String fullName;

    // Getters
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }

    // Setters
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
}