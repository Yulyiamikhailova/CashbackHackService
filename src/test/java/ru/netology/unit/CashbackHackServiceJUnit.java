package ru.netology.unit;

import org.testng.annotations.Test;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceJUnit {

    @Test
    public void testRemainIf1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainIf0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainIf500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(500);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainIf1700() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1700);
        int expected = 300;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainIf2000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 0;

        assertEquals(expected, actual);
    }


}