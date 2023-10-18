import java.util.Scanner;
public class P12_1s22{ 
	public static void main(String[] args){
	int numero = 4;
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingresa un numero");
	numero = teclado.nextInt();
    if (numero % 2 == 0){
    System.out.println("El numero es par");
    }else{
    System.out.println("El numero es impar");
}
}
}