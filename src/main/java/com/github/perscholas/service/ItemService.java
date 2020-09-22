package com.github.perscholas.service;

import com.github.perscholas.model.Deal;

import com.github.perscholas.model.Item;
import com.github.perscholas.model.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepo itemRepo;

    public List<Item> getAllItems(){
        List<Item> allItems=new ArrayList<Item>();
        itemRepo.findAll().forEach(s -> allItems.add(s));
        return allItems;
    }

    public void addDeal(Item item){
        System.out.println("Add Item");
        itemRepo.save(item);
    }
}
