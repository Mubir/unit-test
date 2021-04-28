package com.mubir.unittest.services;

import com.mubir.unittest.domain.SomeSource;
import org.springframework.beans.factory.annotation.Autowired;

public class BusinessImpl {

    SomeSource someSource;

    public void setSomeSource(SomeSource someSource) {
        this.someSource = someSource;
    }

    public int calculateSum(int[] arr)
    {
        int sum =0;

        for(int x:arr)
        {
            sum+=x;
        }
        return sum;
    }

    public  int UsingDataSource()
    {
        int[] data = someSource.getAllData();
        int sum =0;
        for(int x:data)
        {
            sum+=x;
        }
        return sum;
    }

}
