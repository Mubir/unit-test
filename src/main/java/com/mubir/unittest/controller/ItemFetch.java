package com.mubir.unittest.controller;

import com.mubir.unittest.domain.Item;
import com.mubir.unittest.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemFetch {
    @Autowired
    public ItemService banana;
    @GetMapping("/item")
    public Item getItem()
    {
        return new Item(1,"Banana",78,4);
    }

    @GetMapping("/get-banana")
    public Item getBan()
    {
        return banana.getOne();
    }
    @GetMapping("/get-banana-all")
    public List<Item> getBanAll()
    {
        return banana.getAll();
    }


}
