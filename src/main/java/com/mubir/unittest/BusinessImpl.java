package com.mubir.unittest;

public class BusinessImpl {
    public int calculateSum(int[] arr)
    {
        int sum =0;

        for(int x:arr)
        {
            sum+=x;
        }
        return sum;
    }
}
