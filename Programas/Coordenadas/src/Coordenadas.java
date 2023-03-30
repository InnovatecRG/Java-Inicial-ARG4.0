import java.util.Scanner;
public class Coordenadas {
    public static void main(String[] args) {
        int x;// variable del tipo etero que representa un valor en el eje x
        int y;// variable del tipo entero que representa un valor en el eje y
        // ambos valores (x;y) forman el par ordenado representando un punto en el eje
        // carteciano
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese valor para el eje x");
        x = leer.nextInt();
        System.out.println("Ingrese valor para el eje y");
        y = leer.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //comenzando a buscar el cuadrante
        if ((x == 0 && y == 0)) {
            System.out.println("El par ordenado: " + "(" + x + ";" + y + ") se encuentra ordenado al origen");
        }
        else{
            if ((x < 0 && y > 0)){
                System.out.println("El par ordenado: " + "(" + x + ";" + y + ") se encuentra en el cuadrante 2 ");
            }
            else{
                if ((x > 0 && y > 0)){
                    System.out.println("El par ordenado: " + "(" + x + ";" + y + ") se encuentra en el cuadrante 1 ");
                }
                else{
                    if ((x < 0 && y < 0)){
                        System.out.println("El par ordenado: " + "(" + x + ";" + y + ") se encuentra en el cuadrante 3 ");
                    }
                    else{
                        System.out.println("El par ordenado: " + "(" + x + ";" + y + ") se encuentra en el cuadrante 4 ");
                    }
                }
            }
        }

    }
}
