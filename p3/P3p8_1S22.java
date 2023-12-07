import java.util.Scanner;

public class P3p8_1S22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x;

        System.out.println("Ingrese un número:");
        x = teclado.nextDouble();

        double resultado = realizarOperacionCompleta(x);

        System.out.println("El resultado es: " + resultado);
    }

    public static double realizarOperacionCompleta(double x) {
        double resultado = cuadrado(x) - (1 / 5);
        resultado += multiplicar(x) - (1 / 5) + 3*3;
        resultado += sumaTotal(x);
        resultado -= restaDespuesCuadrado(x);
        return resultado;
    }

    public static double cuadrado(double x) {
        return x * x;
    }

    public static double multiplicar(double x) {
        return x + 3*3;
    }

    public static double sumaTotal(double x) {
        return cuadrado(x) + multiplicar(x);
    }

    public static double restaDespuesCuadrado(double x) {
        return multiplicar(x) - (1 / 5) + 3*3;
    }
}