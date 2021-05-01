package com.mubir.unittest.services;

import com.mubir.unittest.domain.Item;

import java.util.List;

public interface ItemService {
    public Item getOne();
    public List<Item> getAll();
}
