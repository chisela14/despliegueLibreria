package com.jacaranda.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUser {

	@Test
    public void testNumber10() {
        assertEquals(10, User.getNumber10());
    }
	@Test
    public void testNumber5() {
        assertEquals(10, User.getNumber5());
    }

}
