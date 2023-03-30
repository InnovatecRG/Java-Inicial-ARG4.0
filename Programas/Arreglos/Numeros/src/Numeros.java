import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        int n = 0;//cantidad de numeros ingresados por el usuario (tamño del arreglo)
        int min, max, contador1, contador2, contador3, numero, suma, multiplo, auxiliar;
        int pos1 = 0;
        int menor = 99999;
        int promedio = 0;
        min = max = contador1 = contador2 = contador3 = numero = suma = multiplo = auxiliar = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros");
        n = teclado.nextInt();
        int arraynumeros[] = new int[n];
                System.out.print("\033[H\033[2J");
        System.out.flush();
        //carga de datos
        System.out.println("Ingrese multiplo");
        multiplo = teclado.nextInt();
            //carga de datos
        for (int i = 0; i < arraynumeros.length; i++) {
            System.out.println("ingrese un numero para la posicion: " + (i + 1));
            numero = teclado.nextInt();
            //asignamos el valor de n al vector
            arraynumeros[i] = numero;}
        //determinar el rango
        System.out.println("Ingrese un valor minimo para determinar el promedio: ");
        min = teclado.nextInt();
        System.out.println("Ingrese un valor maximo para determinar el promedio: ");
        max = teclado.nextInt();

        for (int i = 0; i < arraynumeros.length; i++) {
            if (arraynumeros[i] > min && arraynumeros[i] < max) {
                contador2++;
                suma = suma + arraynumeros[i];
            }
        }
        //buscando impares
        for (int i = 0; i < arraynumeros.length; i++) {
            if (arraynumeros[i] % 2 != 0)//buscando los impares
            {
                contador1++;
                if (arraynumeros[i] < menor) {
                    pos1 = i;
                    menor = arraynumeros[i];
                }
        }
        promedio = suma / contador2;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //impresion del vector





        System.out.println("    Numeros ingresados    ");
        System.out.println("Posicion            Numero");

        for (int i = 0; i < arraynumeros.length; i++) {
            System.out.println("   " + (i + 1) + "                  " + arraynumeros[i]);

        }

        System.out.println("La cantidad de numeros impares ingresados es: " + contador1);
        System.out.println("");
        System.out.println("El menor de lo numeros impares ingresados es: " + menor + " y se encuentra en la pocicion: " + (pos1 + 1));
        System.out.println("RANGO DE VALORES A EVALUAR Min: " + min + " Max: " + max);
        System.out.println("LA suma de los numeros dentro del rango evaluado es" + suma);
        System.out.println("El promedio de los numeros dentro del rango es " + promedio);



    }
}
