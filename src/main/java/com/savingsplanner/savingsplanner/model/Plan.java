package com.savingsplanner.savingsplanner.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Plan {

    @Id
    @GeneratedValue

    private Long id;
    private String title;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String imageUrl;
    private Number targetedAmount;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Number getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(Number currentAmount) {
        this.currentAmount = currentAmount;
    }

    public Number getTargetedAmount() {
        return targetedAmount;
    }

    public void setTargetedAmount(Number targetedAmount) {
        this.targetedAmount = targetedAmount;
    }

    public String getTargetedDate() {
        return targetedDate;
    }

    public void setTargetedDate(String targetedDate) {
        this.targetedDate = targetedDate;
    }

    private Number currentAmount;
    private String targetedDate;



}
