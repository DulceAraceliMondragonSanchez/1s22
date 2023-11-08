import java.util.Scanner;

public class P2p5_1S22{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String operacion;
        int num1, num2;
        int resultado;
        char opc='0';
		while (opc !='S'){
			System.out.println("Menu de operaciones"); 
			System.out.println("S.- Suma");
            System.out.println("R.- Resta");
            System.out.println("M.- Multiplicacion");
            System.out.println("D.- Division");
             System.out.println("X.- Salir");
            System.out.println("Que opcion deseas?");
            opc=teclado.nextLine().charAt(0);

            System.out.println("S.- Suma");
            System.out.println("ingresa el primer numero");
            operacion = teclado.nextLine();
            num1 = Integer.parseInt(operacion);
            System.out.println("ingresa el segundo numero");
            operacion = teclado.nextLine();
            num2 = Integer.parseInt(operacion);
            resultado = num1+num2;
            System.out.println("La Suma es: " + resultado);

            System.out.println("Menu de operaciones"); 
            System.out.println("S.- Suma");
            System.out.println("R.- Resta");
            System.out.println("M.- Multiplicacion");
            System.out.println("D.- Division");
             System.out.println("X.- Salir");
            System.out.println("Que opcion deseas?");
            opc=teclado.nextLine().charAt(0);
            
           
            System.out.println("R.- Resta");
             System.out.println("ingresa el primer numero");
            operacion = teclado.nextLine();
            num1 = Integer.parseInt(operacion);
            System.out.println("ingresa el segundo numero");
            operacion = teclado.nextLine();
            num2 = Integer.parseInt(operacion);
            resultado = num1-num2;
            System.out.println("La Resta es: " + resultado);

            System.out.println("Menu de operaciones"); 
            System.out.println("S.- Suma");
            System.out.println("R.- Resta");
            System.out.println("M.- Multiplicacion");
            System.out.println("D.- Division");
            System.out.println("X.- Salir");
            System.out.println("Que opcion deseas?");
            opc=teclado.nextLine().charAt(0);

            

            System.out.println("M.- Multiplicacion");
            System.out.println("ingresa el primer numero");
            operacion = teclado.nextLine();
            num1 = Integer.parseInt(operacion);
            System.out.println("ingresa el segundo numero");
            operacion = teclado.nextLine();
            num2 = Integer.parseInt(operacion);
            resultado = num1*num2;
            System.out.println("La Multiplicacion es: " + resultado);

            System.out.println("Menu de operaciones"); 
            System.out.println("S.- Suma");
            System.out.println("R.- Resta");
            System.out.println("M.- Multiplicacion");
            System.out.println("D.- Division");
           System.out.println("X.- Salir");
            System.out.println("Que opcion deseas?");
            opc=teclado.nextLine().charAt(0);
            

            System.out.println("D.- Division");
            System.out.println("ingresa el primer numero");
            operacion = teclado.nextLine();
            num1 = Integer.parseInt(operacion);
            System.out.println("ingresa el segundo numero");
            operacion = teclado.nextLine();
            num2 = Integer.parseInt(operacion);
            resultado = num1/num2;
            System.out.println("La Division es: " + resultado);

            System.out.println("Menu de operaciones"); 
            System.out.println("S.- Suma");
            System.out.println("R.- Resta");
            System.out.println("M.- Multiplicacion");
            System.out.println("D.- Division");
             System.out.println("X.- Salir");
            System.out.println("Que opcion deseas?");
            opc=teclado.nextLine().charAt(0);

           

            System.out.println("X.- Salir");
            System.out.println("aqui salimos del proceso");
            opc=teclado.nextLine().charAt(0);
            switch(opc){
            case'S': System.out.println("aqui realizamos la Suma");break;
            case'R': System.out.println("aqui realizamos la Resta");break;
            case'M': System.out.println("aqui realizamos la Multiplicacion");break;
            case'D': System.out.println("aqui realizamos la Division");break;
            case'X': break;	
            }
		}
	}
}
