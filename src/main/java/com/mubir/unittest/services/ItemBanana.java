package com.mubir.unittest.services;

import com.mubir.unittest.domain.Item;
import com.mubir.unittest.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemBanana implements ItemService{
    @Autowired
    private ItemRepository itemRepository;
    @Override
    public Item getOne() {
        return new Item(2,"BigBanana",123,3);
    }

    public List<Item> getAll()
    {
         List<Item> temp = itemRepository.findAll();
         for(Item x:temp)
         {
             x.setValue(x.getPrice()*13);
         }
        return temp;
    }
}
