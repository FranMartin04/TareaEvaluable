package funciones;

public class OperacionesMatematicas {

    public static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("El factorial no está definido para números negativos");
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static boolean esCapicua(int numero) {
        String numStr = String.valueOf(numero);
        int longitud = numStr.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int numero) {
        int siguiente = numero + 1;
        while (!esPrimo(siguiente)) {
            siguiente++;
        }
        return siguiente;
    }

    public static int potencia(int base, int exponente) {
        if (exponente < 0)
            throw new IllegalArgumentException("El exponente debe ser un número no negativo");
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static int digitos(int numero) {
        if (numero == 0)
            return 1;
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }
}
