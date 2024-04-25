package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import funciones.FuncionesArrays;

class FuncionesArraysTest {

    @Test
    public void testGeneraArrayInt() {
        int[] array = FuncionesArrays.generaArrayInt(10, 1, 100);
        assertEquals(10, array.length);
        for (int i : array) {
            assertTrue(i >= 1 && i <= 100);
        }
    }

    @Test
    public void testMediaArrayInt() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3.0, FuncionesArrays.mediaArrayInt(array), 0.01);
    }

    @Test
    public void testEstaEnArrayInt() {
        int[] array = {1, 2, 3, 4, 5};
        assertTrue(FuncionesArrays.estaEnArrayInt(array, 3));
        assertFalse(FuncionesArrays.estaEnArrayInt(array, 6));
    }
}
