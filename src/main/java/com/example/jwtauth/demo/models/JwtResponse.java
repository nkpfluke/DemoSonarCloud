package com.example.jwtauth.demo.models;

import lombok.*;


public class JwtResponse {

    private String jwtToken;
    private String userName;

    public JwtResponse() {
        // Default constructor
    }

    public JwtResponse(String jwtToken, String userName) {
        this.jwtToken = jwtToken;
        this.userName = userName;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static JwtResponseBuilder builder() {
        return new JwtResponseBuilder();
    }

    public static class JwtResponseBuilder {
        private String jwtToken;
        private String userName;

        public JwtResponseBuilder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        public JwtResponseBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public JwtResponse build() {
            return new JwtResponse(jwtToken, userName);
        }
    }
}