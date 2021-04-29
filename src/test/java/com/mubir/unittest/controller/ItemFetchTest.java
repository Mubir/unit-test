package com.mubir.unittest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ItemFetch.class)
class ItemFetchTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void itemTest() throws Exception
    {
        RequestBuilder requet = MockMvcRequestBuilders
                .get("/item")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mvc.perform(requet)
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\":1,\"name\":\"Banana\",\"price\":78,\"quantity\":4}"))
                .andReturn();

    }
}