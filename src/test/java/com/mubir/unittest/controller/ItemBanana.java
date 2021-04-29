package com.mubir.unittest.controller;

import com.mubir.unittest.domain.Item;
import com.mubir.unittest.services.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ItemFetch.class)
class ItemBanana {
    @Autowired
    MockMvc mock;
    @MockBean
    private ItemService bananaGet;
    @Test
    public  void bana() throws Exception
    {
        when(bananaGet.getOne()).thenReturn(new Item(1,"bigBan",99,4));

        RequestBuilder requet = MockMvcRequestBuilders
                .get("/get-banana")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mock.perform(requet)
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\":1,\"name\":\"bigBan\",\"price\":99,\"quantity\":4}"))
                .andReturn();

    }
}