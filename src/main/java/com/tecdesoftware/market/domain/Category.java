package com.tecdesoftware.market.domain;

public class Category {
    private int catrgoryId;
    private String category;
    private boolean active;

    public int getCatrgoryId() {
        return catrgoryId;
    }

    public void setCatrgoryId(int catrgoryId) {
        this.catrgoryId = catrgoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
