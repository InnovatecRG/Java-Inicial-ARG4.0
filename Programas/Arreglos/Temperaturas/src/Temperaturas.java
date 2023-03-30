import java.util.Scanner;
public class Temperaturas {
    public static void main(String[] args) {
        int dias=0;
        int temperaturas=0;
        int promedio=0;
        int promedio1=0;
        int sumatemp=0;
        int contador1=0;
        int contador2=0;
        int sumador=0;
        System.out.println("ingrese la cantidad de dias ");
        Scanner teclado=new Scanner(System.in);
        dias=teclado.nextInt();
        int temperatura[]=new int[dias];
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Ingrese temperatura para el el dia: "+(i+1));
            temperaturas=teclado.nextInt();
            temperatura[i]=temperaturas;
            sumatemp=sumatemp+temperaturas;
            if(temperaturas<0)//determinamos si la temperatura es bajo cero
            {
                contador1++;

            }
            else{//si la temperatura no es bajo cero, preguntamos si es superior a 20 c°
                if(temperaturas>20)
                {
                    contador2++;
                    sumador=sumador+temperaturas;
                }
            }

        }

        promedio=sumatemp/dias;
        System.out.print("\033[H\033[2J");
        System.out.flush();
//impresion
        System.out.println("Dia "+"   Temperatura C°");
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println((i+1)+"          "+temperatura[i]);

        }
       if(contador2!=0) {
           promedio1=sumador/contador2;
       }
        System.out.println("");
        System.out.println("El promedio de temperaturas fue: "+promedio+"C°");
        System.out.println("Cantidad de Dias con temperaturas superiores a 20 c° "+contador2+", pomedio de T° "+promedio1);

    }
}
