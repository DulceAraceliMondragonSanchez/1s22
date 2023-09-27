import java.util.Scanner;
public class P14_1s22{ 
	public static void main(String[] args){ 
	Scanner teclado = new Scanner(System.in);
	String opc;
	int resultado;
    int num1, num2;

	System.out.println("Menu de opciones");
	System.out.println("\n Suma");
	System.out.println("\n Resta");
	System.out.println("\n Division");
	System.out.println("\n Multiplicacion");
	System.out.println("\n Que opcion desea: ");
	opc = teclado.nextLine();
 
	switch(opc){ 
    case "Suma":
    System.out.println("Aqui va la suma");
    System.out.println("Ingresa el primer numero");
    opc = teclado.nextLine();
    num1 = Integer.parseInt(opc);
    System.out.println("ingresa el segundo numero");
	opc = teclado.nextLine();
    num2 = Integer.parseInt(opc);
    resultado = num1+num2;
    System.out.println("La suma es:" + resultado);
    break; 

    case "Resta":
    System.out.println("Aqui va la resta");
    System.out.println("Ingresa el primer numero");
    opc = teclado.nextLine();
    num1 = Integer.parseInt(opc);
    System.out.println("ingresa el segundo numero");
	opc = teclado.nextLine();
    num2 = Integer.parseInt(opc);
    resultado = num1-num2;
    System.out.println("La Resta es:" + resultado);
    break;
    case "Division":
    System.out.println("Aqui va la Division");
    System.out.println("Ingresa el primer numero");
    opc = teclado.nextLine();
    num1 = Integer.parseInt(opc);
    System.out.println("ingresa el segundo numero");
	opc = teclado.nextLine();
    num2 = Integer.parseInt(opc);
    resultado = num1/num2;
    System.out.println("La Division es:" + resultado);
    break;
    case "Multiplicacion":	
    System.out.println("Aqui va la Multiplicacion");
    System.out.println("Ingresa el primer numero");
    opc = teclado.nextLine();
    num1 = Integer.parseInt(opc);
    System.out.println("ingresa el segundo numero");
	opc = teclado.nextLine();
    num2 = Integer.parseInt(opc);
    resultado = num1*num2;
    System.out.println("La Multiplicacion es:" + resultado);
    break;
    default: System.out.println("No existe la opcion");
    }
}
}