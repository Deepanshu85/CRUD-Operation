package com.tericcabrel.auth_api.responses;

 // Ensure the package name is correct

public class LoginResponse {
    private String token;
    private long expiresIn;

    // ✅ Default constructor
    public LoginResponse() {}

    // ✅ Parameterized constructor
    public LoginResponse(String token, long expiresIn) {
        this.token = token;
        this.expiresIn = expiresIn;
    }

    // ✅ Getters
    public String getToken() {
        return token;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    // ✅ Setters (Returning 'this' for method chaining)
    public LoginResponse setToken(String token) {
        this.token = token;
        return this;
    }

    public LoginResponse setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    // ✅ Override toString() for debugging/logging
    @Override
    public String toString() {
        return "LoginResponse{" +
                "token='" + token + '\'' +
                ", expiresIn=" + expiresIn +
                '}';
    }
}
