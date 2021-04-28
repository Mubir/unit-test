package com.mubir.unittest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ListMock {
    List ll = mock(List.class);

    @Test
    public  void ListTest()
    {
        when(ll.size()).thenReturn(5).thenReturn(10);
        assertEquals(5,ll.size());
        assertEquals(10,ll.size());
    }
    @Test
    public  void ListTestTwo()
    {
        when(ll.get(66)).thenReturn("helloworld");
        assertEquals("helloworld",ll.get(66));

    }
    @Test
    public void verifyUsages()
    {
        String value =(String) ll.get(0);
        String value2 =(String) ll.get(1);
        verify(ll).get(0);// if get is called or not
        verify(ll,atMost(2)).get(anyInt());// verify that at most 2 times called.
    }
}
