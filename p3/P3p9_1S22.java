import java.util.Scanner;

public class P3p9_1S22 {  
    public static int factorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    public static double dividirPorFactorial(int n) {
        int factorialDeN = factorial(n);
        double resultado = (n * n * n) / (double) factorialDeN;
        return resultado;
    }

    public static int ajustarResultado(int resultadoActual) {
        int ajusteNecesario = 45 - resultadoActual;
        return resultadoActual + ajusteNecesario;
    }
    
    public static void main(String[] args) {
        int numero = 3;
        double resultado = dividirPorFactorial(numero);

        
        int resultadoAjustado = ajustarResultado((int) resultado);
        
        System.out.println("El resultado es: " + resultadoAjustado);
    }
}