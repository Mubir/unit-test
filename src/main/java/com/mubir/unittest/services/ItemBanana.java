package com.mubir.unittest.services;

import com.mubir.unittest.domain.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemBanana implements ItemService{
    @Override
    public Item getOne() {
        return new Item(2,"BigBanana",123,3);
    }
}
