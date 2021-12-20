package com.example.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CalcServiceTest {
    @Spy
    private CalcService calcService;

    @Test
    void test1() {
        doReturn(100).when(calcService).sub(100, 1);

        var subResult = calcService.sub(100, 1);
        assertEquals(100, subResult);

        var divResult = calcService.div(100, 0);
        assertEquals(0, divResult);
    }
}
