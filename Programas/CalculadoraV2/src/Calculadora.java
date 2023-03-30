import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        float n1,n2;//declaramos dos variables del tipo flotante n1 y n2
        n1=n2=0;//asignamos el valor cero(0) a ambas variables
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese valor del primer numero ");
        n1=leer.nextInt();
        System.out.println("Ingrese valor del primer numero ");
        n2=leer.nextInt();
        System.out.println("La suma del numero 1 y el numero 2 es "+(n1+n2));
        System.out.println("La resta del numero 1 y el numero 2 es "+(n1-n2));
        System.out.println("La Multiplicacion  del numero 1 y el numero 2 es "+(n1*n2));
        System.out.println("La division del numero 1 y el numero 2 es "+(n1/n2));
    }
}
