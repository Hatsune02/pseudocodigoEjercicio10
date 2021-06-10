import java.util.Scanner;

public class Ejercicio10Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
       int numeroMil = 0;
       int cantidadMultiplo6 = 0;
       int suma = 0;
       int var = 0;

       do{
           var = getInt("Ingrese un número para que se sume y llegue a 1000, numero actual " + numeroMil);
           numeroMil = numeroMil + var;
           if (var % 6 == 0){
               cantidadMultiplo6++;
           }
           if(var >= 1 && var <= 10){
               suma = suma + var;
           }
       } while(numeroMil < 1000);

       System.out.println("La cantidad números múltiplos de 6 :"+ cantidadMultiplo6 + " y la suma de números que se encuentrarn entre 1 y 10" + suma);

    }

    public static int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9]*$")){
                n = "";
            }
        }
        
        return Integer.parseInt(n);
    }
}