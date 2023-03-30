import java.util.Scanner;
public class Mayor_con_while {
    public static void main(String[] args) {
        int numero=0;
        int may=0;
        int cant=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numeros, para finalizar precione con (-1000)");
        numero=leer.nextInt();
        while(numero!=-1000){
            System.out.println("Numero ingresado: "+numero);
            if(numero>may){
                may=numero;
            }
            cant++;
            numero=leer.nextInt();

        }

        System.out.println("La cantidad de numeros ingresos fue: "+cant);
        System.out.println("El Numero mas grande es: "+may);

    }
}
