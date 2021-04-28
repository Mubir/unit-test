package com.mubir.unittest.services;

import com.mubir.unittest.domain.SomeSource;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class BusinessImplTestUsingSourceMock {

    @Test
    void usingDataSource() {
        BusinessImpl business = new BusinessImpl();
        /*
        * this is just creating SomeSource implementation using mockito
        * other than creating class implementation we are using method
        * level implementation.
        * */
        SomeSource source = mock(SomeSource.class);
        when(source.getAllData()).thenReturn(new int[]{5,7,3});

        business.setSomeSource(source);
        int actualResult = business.UsingDataSource();
        int expectedResult = 15;
        assertEquals(expectedResult,actualResult);
    }
}