import java.util.Scanner;
public class Temperaturas {
    public static void main(String[] args) {
        int dias=0;//declaro una variable para almacenar la cantidad de dias
        int temperatura=0;//aquí se almacena la temperatura de cada dia
        int pro1=0;//promedio temperaturas general
        int pro2=0;//vaariable donde se calculara el promedio de las temperaturas mayores a 20c°
        int contador1=0;//cuenta los dias con temperaturas bajo cero
        int contador2=0;//cuenta la cantidad de dias calidos
        int sumador1,sumador2;
        sumador1=sumador2=0;

        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese cantidad de dias registrados");
        dias=teclado.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.flush();
//inicio del ciclo o bucle
        System.out.println("La Cantidad de dias para registrar la temperatura son: "+dias);
        for(int i=0;i<dias;i++){
            System.out.println("ingrese temperatura registrada para el dia: "+(i+1));
            temperatura=teclado.nextInt();
            if(temperatura<0){//determinamos si la temperatura es bajo cero
                contador1++;

            }
            else{//si la temperatura no es bajo cero, preguntamos si es superior a 20 c°
                if(temperatura>20)
                {
                    contador2++;
                    sumador1=sumador1+temperatura;
                }
            }
            sumador2=sumador2+temperatura;
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        pro1=sumador2/dias;
        if(contador2!=0){
            pro2=sumador1/contador2;
        }



        System.out.println("\u001B[32m"+"Promedio de temperaturas de los "+dias+" dias es "+pro1+"°");
        System.out.println("");
        System.out.println("\u001B[32m"+"La cantidad de dias con temperaturas bajo cero fueron "+contador1);
        System.out.println("");
        System.out.println("\u001B[32m"+"La cantidad de dias con temperaturas superiores a 20 c° son "+contador2+" y el promedio de t° fue: "+pro2+"°");

    }
}
