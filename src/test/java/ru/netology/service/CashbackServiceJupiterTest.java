package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackServiceJupiterTest {

    @Test
    public void shouldReturn1000for0() {
        CashbackService service = new CashbackService();

        assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldReturn100For900() {
        CashbackService service = new CashbackService();

        assertEquals(900, service.remain(100));
    }

    @Test
    public void shouldReturn999For1() {
        CashbackService service = new CashbackService();

        assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldReturn999For1001() {
        CashbackService service = new CashbackService();

        assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldReturn0For1000() {
        CashbackService service = new CashbackService();

        assertEquals(0, service.remain(1000));
    }
}
