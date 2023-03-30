import java.util.Scanner;
public class Buscar_Mayor {
    public static void main(String[] args) {
        int cantidad=0;
        int numero=0;
        int mayor=-99999;
        int menor=99999;
        int pos1,pos2;
        pos1=pos2=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros: ");
        cantidad=teclado.nextInt();
        int [] numeros=new int[cantidad];//declaracion del vector arreglo
        //carga del Vector
        System.out.println("Comencemos a Cargar los numeros para comparar ");
        System.out.println("");
        for(int i=0;i<numeros.length;i++){
            System.out.println("Ingrese numero a comparar ");
            numero=teclado.nextInt();
            System.out.println("");
            numeros[i]=numero;
            //empezamos a comparar y buscar el mayor y el menor
            if(numeros[i]<menor){
                menor=numeros[i];
                pos1=i+1;
            }
            if(numeros[i]>mayor){
                mayor=numeros[i];
                pos2=i+1;
            }
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
//impresion del vector
        System.out.println("Listado de numeros cargados");
        System.out.println("");
        System.out.println(" Posicion        Numero ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("    "+(i+1)+"              "+numeros[i]);

        }
        System.out.println("");
        System.out.println("El mayor de los numeros es: "+mayor+" y se encuentra en la pocision: "+pos2+" del arreglo");
        System.out.println("");
        System.out.println("El menor de los numeros es: "+menor+" y se encuentra en la pocision: "+pos1+" del arreglo");

    }
}
