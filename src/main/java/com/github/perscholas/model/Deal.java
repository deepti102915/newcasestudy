package com.github.perscholas.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Deal {


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public String getDealCategory() {
        return dealCategory;
    }

    public void setDealCategory(String dealCategory) {
        this.dealCategory = dealCategory;
    }

    public String getDealDescription() {
        return dealDescription;
    }

    public void setDealDescription(String dealDescription) {
        this.dealDescription = dealDescription;
    }

    public Double getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(Double dealPrice) {
        this.dealPrice = dealPrice;
    }

    public String getDealCondition() {
        return dealCondition;
    }

    public void setDealCondition(String dealCondition) {
        this.dealCondition = dealCondition;
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getDealManufacturer() {
        return dealManufacturer;
    }

    public void setDealManufacturer(String dealManufacturer) {
        this.dealManufacturer = dealManufacturer;
    }

    @Id
    private Integer id;
    private String dealName;
    private String dealCategory;
    private String dealDescription;

    public Double getDealPrice1() {
        return dealPrice1;
    }

    public void setDealPrice1(Double dealPrice1) {
        this.dealPrice1 = dealPrice1;
    }

    private Double dealPrice1;
    private Double dealPrice;
    private String dealCondition;
    private String dealStatus;
    private int unitInStock;
    private String dealManufacturer;



}
