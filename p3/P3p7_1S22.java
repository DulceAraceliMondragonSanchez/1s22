import java.util.Scanner;

public class P3p7_1S22 {

    public static int promedio(int a, int b, int c) {
        return ((a + b + c) / 5);
    }

    public static int[] captura() {
        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);
        for (int a = 0; a < 5; a++) {
            System.out.println("Ingrese el valor para la posición [" + (a + 1) + "]: ");
            numeros[a] = teclado.nextInt();
        }

        return numeros;
    }

    public static void main(String[] args) {
        int[] a = captura();
        int[] b = captura();

        // Calcular la matriz resultante c
        int[] c = new int[5];
        for (int i = 0; i < 5; i++) {
            c[i] = a[i] + b[i];
        }

        // Mostrar la matriz resultante c
        System.out.print("La matriz resultante c es: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(c[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Calcular y mostrar el promedio de la matriz resultante c
        int promedioC = promedio(c[0], c[1], c[2]);
        System.out.println("El promedio de la matriz resultante c es: " + promedioC);
    }
}
