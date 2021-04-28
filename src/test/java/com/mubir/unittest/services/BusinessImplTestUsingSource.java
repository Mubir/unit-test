package com.mubir.unittest.services;

import com.mubir.unittest.domain.SomeSource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class BusinessImplTestUsingSourceMock {
    @InjectMocks
    BusinessImpl business = new BusinessImpl();
    @Mock
    SomeSource source ;
    @Test
    void usingDataSource() {

        /*
        * this is just creating SomeSource implementation using mockito
        * other than creating class implementation we are using method
        * level implementation.
        * */

        when(source.getAllData()).thenReturn(new int[]{5,7,3});

       // business.setSomeSource(source);
        // as we are using @InjectMocks and @Mock we don't need to set
        // it will automatically set for @InjectMocks
        int actualResult = business.UsingDataSource();
        int expectedResult = 15;
        assertEquals(expectedResult,actualResult);
    }
}