package funciones;

import java.util.Random;

public class FuncionesArrays {

    public static int[] generaArrayInt(int n, int min, int max) {
        if (n <= 0)
            throw new IllegalArgumentException("El tamaño del array debe ser mayor que cero");
        if (min > max)
            throw new IllegalArgumentException("El mínimo no puede ser mayor que el máximo");

        int[] array = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt((max - min) + 1) + min;
        }
        return array;
    }

    public static double mediaArrayInt(int[] array) {
        if (array.length == 0)
            throw new IllegalArgumentException("El array no puede estar vacío");

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static boolean estaEnArrayInt(int[] array, int num) {
        for (int i : array) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}

