import java.util.Scanner;
public class El_Mayor_v1 {
    public static void main(String[] args) {
        int numero1,numero2;//declaro en una sola linea dos variables que almacenan un entero
        Scanner tomarvalor = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        numero1=tomarvalor.nextInt();
        System.out.println("ingrese el segundo numero: ");
        numero2=tomarvalor.nextInt();
        //prueba de valores
        System.out.println(numero1);
        System.out.println(numero2);
        if(numero1>numero2){
            System.out.println("El mayor de los dos numeros es: "+numero1);
        }
        else{
            System.out.println("El mayor de los dos numeros es: "+numero2);
        }
    }


}
