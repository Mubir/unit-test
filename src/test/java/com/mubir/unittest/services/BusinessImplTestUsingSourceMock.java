package com.mubir.unittest.services;

import com.mubir.unittest.domain.SomeSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeSourceImpl implements SomeSource {
    @Override
    public int[] getAllData() {
        return new int[]{4, 9, 2};
    }
}
class BusinessImplTestUsingSource {

    @Test
    void usingDataSource() {
        BusinessImpl business = new BusinessImpl();
        business.setSomeSource(new SomeSourceImpl());
        int actualResult = business.UsingDataSource();
        int expectedResult = 15;
        assertEquals(expectedResult,actualResult);
    }
}