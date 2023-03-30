import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
int n=0;//cantidad de personas
        Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese Cantidad de Personas a Registrar");
        n= teclado.nextInt();
        Persona array[]=new Persona[n];
        //carga de datos
        for (int i = 0; i <array.length ; i++) {
            array[i].RegistrarPersona(i+1);
        }














    }
}
