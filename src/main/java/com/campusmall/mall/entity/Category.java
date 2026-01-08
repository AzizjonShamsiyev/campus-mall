package com.campusmall.mall.entity;

import java.sql.Timestamp;

public class Category {
    private Long id;
    private String name;
    private String description;
    private Byte status;
    private Timestamp createdAt;

    // Getter va Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Byte getStatus() { return status; }
    public void setStatus(Byte status) { this.status = status; }

    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
}
