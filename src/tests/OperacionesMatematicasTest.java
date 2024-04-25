package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import funciones.OperacionesMatematicas;

class OperacionesMatematicasTest {


    @Test
    public void testFactorial() {
        assertEquals(1, OperacionesMatematicas.factorial(0));
        assertEquals(1, OperacionesMatematicas.factorial(1));
        assertEquals(120, OperacionesMatematicas.factorial(5));
        assertEquals(720, OperacionesMatematicas.factorial(6));
    }

    @Test
    public void testEsCapicua() {
        assertTrue(OperacionesMatematicas.esCapicua(121));
        assertTrue(OperacionesMatematicas.esCapicua(12321));
        assertFalse(OperacionesMatematicas.esCapicua(1234));
        assertTrue(OperacionesMatematicas.esCapicua(0));
    }

    @Test
    public void testEsPrimo() {
        assertFalse(OperacionesMatematicas.esPrimo(1));
        assertTrue(OperacionesMatematicas.esPrimo(2));
        assertTrue(OperacionesMatematicas.esPrimo(3));
        assertFalse(OperacionesMatematicas.esPrimo(4));
        assertTrue(OperacionesMatematicas.esPrimo(5));
        assertFalse(OperacionesMatematicas.esPrimo(6));
        assertTrue(OperacionesMatematicas.esPrimo(7));
    }

    @Test
    public void testSiguientePrimo() {
        assertEquals(2, OperacionesMatematicas.siguientePrimo(1));
        assertEquals(3, OperacionesMatematicas.siguientePrimo(2));
        assertEquals(5, OperacionesMatematicas.siguientePrimo(4));
        assertEquals(11, OperacionesMatematicas.siguientePrimo(7));
    }

    @Test
    public void testPotencia() {
        assertEquals(8, OperacionesMatematicas.potencia(2, 3));
        assertEquals(1, OperacionesMatematicas.potencia(10, 0));
        assertEquals(81, OperacionesMatematicas.potencia(3, 4));
    }

    @Test
    public void testDigitos() {
        assertEquals(1, OperacionesMatematicas.digitos(0));
        assertEquals(1, OperacionesMatematicas.digitos(5));
        assertEquals(3, OperacionesMatematicas.digitos(123));
        assertEquals(4, OperacionesMatematicas.digitos(1000));
    }
	

}
