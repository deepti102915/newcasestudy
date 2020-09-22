package com.github.perscholas.service;

import com.github.perscholas.model.Deal;
import com.github.perscholas.model.DealRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DealService {
    @Autowired
    DealRepo dealRepo;

    public List<Deal> getAllDeals(){
        List<Deal> allDeals=new ArrayList<Deal>();
        dealRepo.findAll().forEach(s -> allDeals.add(s));
        return allDeals;
    }

    public void addDeal(Deal deal){
        System.out.println("Add Deal");
        dealRepo.save(deal);
    }
}
