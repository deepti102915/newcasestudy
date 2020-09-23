package com.github.perscholas.model;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@Entity
public class Deal implements DealRepo{


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


    @Override
    public List<Deal> findAll() {
        return null;
    }

    @Override
    public List<Deal> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Deal> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Deal> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Deal deal) {

    }

    @Override
    public void deleteAll(Iterable<? extends Deal> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Deal> S save(S s) {
        return null;
    }

    @Override
    public <S extends Deal> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Deal> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Deal> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Deal> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Deal getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Deal> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Deal> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Deal> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Deal> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Deal> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Deal> boolean exists(Example<S> example) {
        return false;
    }
}
