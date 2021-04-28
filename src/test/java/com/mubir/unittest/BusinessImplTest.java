package com.mubir.unittest;

import com.mubir.unittest.services.BusinessImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessImplTest {

    @Test
    void calculateSum() {
        BusinessImpl business = new BusinessImpl();
        int actualResult = business.calculateSum(new int[]{1,2,3,4});
        int expectedResult = 10;
        assertEquals(expectedResult,actualResult);
    }
}