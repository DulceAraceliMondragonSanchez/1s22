import java.util.Scanner;
public class P2p10_1S22{
 public static void main(String[] args){
 Scanner teclado = new Scanner(System.in);
 int [][] Ma, Mb, Mc;
 int f,c,i,j;
 System.out.println("ingrese el tamaño de la matriz cuadratica ");
 f = teclado.nextInt();
 if(f>0){
 c=f;
    Ma = new int[f][c]; 
    Mb = new int[f][c];
    Mc = new int[f][c];
    System.out.println("valor f "+f+" valor para c "+ c);
    for (i=0;i<f;i++){
    for (j=0;j<c;j++){
    System.out.println("Ingrese el valor para la matriz A["+i+"]["+j+"]: ");
    Ma[i][j]=teclado.nextInt();
 }
 }
   
   for (i=0;i<f; i++){
   for (j=0;j<c; j++){
   System.out.println("Ingrese el valor para la matriz B["+i+"]["+j+"]: ");
   Mb[i][j]=teclado.nextInt();


}
}
   for (i=0;i<f; i++){
   for (j=0;j<c; j++){
   Mc[i][j]=Ma[i][j]-Mb[i][j];
}
}
   for (i=0;i<f; i++){
   for (j=0;j<c; j++){
   System.out.println("el resultado de la matriz C["+i+"]["+j+"]: "+Mc[i][j]);
 }
}
}else{
 System.out.println("No se puede procesar una matriz en 0 o negativa");
}
}
}

 

