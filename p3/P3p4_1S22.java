import java.util.Scanner;
public class P3p4_1S22{
   
    public static void alcuadrado(int pasada, int valor){
    Scanner teclado = new Scanner(System.in);
    if (!(pasada == 6)) alcuadrado(pasada+1,valor*2);
    System.out.println("eliga a la potencia que quiera subir su numero");
    double b = teclado.nextInt();
    System.out.println("valor contiene" + Math.pow(valor, 2));
    }
    



    public static void main(String[] args){
        //2*2*2*2*2*2
        //Como puedo elevar al cuadrado un numero x sin utlizar for
    alcuadrado(2,2*2);    
}
}