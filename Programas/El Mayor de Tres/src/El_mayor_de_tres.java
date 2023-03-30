import java.util.Scanner;
public class El_mayor_de_tres {
    public static void main(String[] args) {
        int numero1,numero2,numero3;
        System.out.println("Ingrese un valor par el primer numero: ");
        Scanner leer=new Scanner(System.in);
        numero1=leer.nextInt();
        System.out.println("Ingrese un valor par el segundo numero: ");
        numero2=leer.nextInt();
        System.out.println("Ingrese un valor par el tercer  numero: ");
        numero3=leer.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //prueba de valores
        System.out.println("numero1: "+numero1);
        System.out.println("numero2: "+numero2);
        System.out.println("numero3: "+numero3);
        System.out.println("################");
        System.out.println("");
        //buscando el mayor de los tres numeros
        if((numero1>numero2)&&(numero1>numero3)){
            System.out.println("El mayor de los tres numeros ingresados es: "+numero1);
        }
        else{
            if((numero2>numero1)&&(numero2>numero3)){
                System.out.println("El mayor de los tres numeros ingresados es: "+numero2);
            }
            else{
                System.out.println("El mayor de los tres numeros ingresados es: "+numero3);

            }
        }

    }
}
