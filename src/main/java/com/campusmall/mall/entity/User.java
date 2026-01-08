package com.campusmall.mall.entity;

import java.sql.Timestamp;

public class User {
    private Long id;
    private String username;
    private String password;
    private String fullName;
    private String phone;
    private String email;
    private String role; // ADMIN, USER, CUSTOMER_SERVICE
    private Byte status; // 1 = active
    private Timestamp createdAt;
    private Timestamp updatedAt;

    // Getter va Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public Byte getStatus() { return status; }
    public void setStatus(Byte status) { this.status = status; }

    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }

    public Timestamp getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Timestamp updatedAt) { this.updatedAt = updatedAt; }
}
