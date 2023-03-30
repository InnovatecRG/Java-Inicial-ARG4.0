import java.util.Scanner;
public class claculadora {
    public static void main(String[] args) {
        int n1,n2;//declaramos dos variables del tipo int n1 y n2
        n1=n2=0;//asignamos el valor cero(0) a ambas variables
        Scanner leer =new Scanner(System.in);
//pausa el programa hasta que el usuario pulse <ENTER>
        System.out.println("Ingrese valor del primer numero ");
        n1=leer.nextInt();
        System.out.println("Ingrese valor del segundo numero numero ");
        n2=leer.nextInt();
        int adicion=n1+n2;
        int diferencia=n1-n2;
        int producto=n1*n2;
        float cociente=n1/(float)n2;
        System.out.println("La suma del numero 1 y el numero 2 es "+adicion);
        System.out.println("La resta del numero 1 y el numero 2 es "+diferencia);
        System.out.println("La Multiplicacion  del numero 1 y el numero 2 es "+producto);
        System.out.println("La division del numero 1 y el numero 2 es "+cociente);

    }
}
