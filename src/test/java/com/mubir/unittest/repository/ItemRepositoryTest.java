package com.mubir.unittest.repository;

import com.mubir.unittest.domain.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class ItemRepositoryTest {
    @Autowired
    private ItemRepository repository;

    @Test
    public void dbTest()
    {
        List<Item>  size = repository.findAll();

        assertEquals(3,size.size());

    }
}