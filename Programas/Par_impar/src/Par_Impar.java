import java.util.Scanner;
 class Par_Impar {
    public static void main(String[] args) {
        int numero=0;
        int cant=0;
        int par=0;
        int imp=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numeros, para finalizar precione (0)");
        numero=leer.nextInt();
        while(numero!=0){
            System.out.println("Numero ingresado: "+numero);
            if(numero%2==0){
                par++;
            }
            else{
                imp++;
            }
            cant++;
            numero=leer.nextInt();

        }
        System.out.println("La cantidad de numeros ingresos fue: "+cant);
        System.out.println("La cantidad de numeros pares es: "+par);
        System.out.println("La Cantidad de numeros impares es: "+imp);
    }
    }

