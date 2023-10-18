import java.util.Scanner;

public class P2p1_1S22{
	public static void main (String[] args) {
int opc = 1;
switch(opc){
case 1:
	System.out.println("Aqui estamos en la primera opcion");
	break;
case 2:
	System.out.println("Aqui estamos en la segunda opcion");
	break;
case 3:
	System.out.println("Aqui estamos en la tercera opcion");
	break;
	default: 
    System.out.println("No existe el valor dentro de los casos");
}

char opc1='a';
switch(opc1){ 
case 'a':
	System.out.println("selecciono A");
	break;
case 'b':
	System.out.println("selecciono B");
	break;
case 'c':
	System.out.println("selecciono C");
	break;
default:
	System.out.println("no esta dentro de las opciones");
  }
  char opc2;
  Scanner teclado = new Scanner(System.in);
  String operacion;
  int num1, num2;
  int resultado;
  System.out.println("Utiliza algun caso para hacer alguna operacion");
  opc2 = teclado.next().charAt(0);
  teclado.nextLine();
  switch(opc2){
  case 's':
    System.out.println("ingresa el primer numero");
  	operacion = teclado.nextLine();
  	num1 = Integer.parseInt(operacion);
  	System.out.println("ingresa el segundo numero");
  	operacion = teclado.nextLine();
  	num2 = Integer.parseInt(operacion);
  	resultado = num1+num2;
  	System.out.println("La suma es: " + resultado);
  	System.out.println("aqui ira las operaciones de suma");
  	break;
  case 'r':
  	System.out.println("ingresa el primer numero");
  	operacion = teclado.nextLine();
  	num1 = Integer.parseInt(operacion);
  	System.out.println("ingresa el segundo numero");
  	operacion = teclado.nextLine();
  	num2 = Integer.parseInt(operacion);
  	resultado = num1-num2;
  	System.out.println("La resta es: " + resultado);
  	System.out.println("aqui ira las operaciones de la restas");
  	break;
  case 'm':
  	System.out.println("aqui ira las operaciones de multiplicacion");
  	System.out.println("ingresa el primer numero");
  	operacion = teclado.nextLine();
  	num1 = Integer.parseInt(operacion);
  	System.out.println("ingresa el segundo numero");
  	operacion = teclado.nextLine();
  	num2 = Integer.parseInt(operacion);
  	resultado = num1*num2;
  	System.out.println("La resta es: " + resultado);
  	System.out.println("aqui ira las operaciones de la multiplicacion");
  	break;
  case 'd':
  	System.out.println("ingresa el primer numero");
  	operacion = teclado.nextLine();
  	num1 = Integer.parseInt(operacion);
  	System.out.println("ingresa el segundo numero");
  	operacion = teclado.nextLine();
  	num2 = Integer.parseInt(operacion);
  	resultado = num1/num2;
  	System.out.println("La resta es: " + resultado);
  	System.out.println("aqui ira las operaciones de la division");
  	break;
  	
  	default:
    System.out.println("no existe la operacion a realizar...");
  }
}
}


