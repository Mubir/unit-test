package com.mubir.unittest.controller;

import com.mubir.unittest.domain.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemFetch {
    @GetMapping("/item")
    public Item getItem()
    {
        return new Item(1,"Banana",78,4);
    }
}
