package com.mubir.unittest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.junit.jupiter.api.Assertions.assertEquals;
@WebMvcTest(AbcController.class)
class AbcControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void getEchoTest () throws Exception
    {
        // build request and content type
        RequestBuilder request = MockMvcRequestBuilders
                .get("/echo")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mvc.perform(request).andReturn();
        //verify
        assertEquals("hello can you hear me",result.getResponse().getContentAsString());
    }
}