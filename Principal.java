
import java.util.Scanner;
/**
 * Problema de un colectivo  * 
 * @author Jeimmy Naranjo
 * @version 1
 */
public class Principal  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada: Ktransporte(Kilos a transportar)
        // 1. Definicion de variables
        // Datos de entrada
        int capacidad,pasajeros;
    
        // Datos de salida
        int dinero_tur,dinero_prop;
        double viajenec;
      
        
        //Variables adicionales
        int Precio_pasa = 10000; // Precio por pasajero
        int Precio_prop = 2000;  //Precio al propietario
        
        
        
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese la capacidad del colectivo");
        capacidad = teclado.nextInt();
        System.out.print("Ingrese la cantidad de personas a transportar");
        pasajeros = teclado.nextInt();
       
        
        
        // 2. Realizar calculos
        // cantidad de viajes necesarios
        viajenec = pasajeros / capacidad;
        int iviajenec = (int)viajenec; //convertir la variable double a entera
        //Pago de turistas a colectivo
        dinero_tur = pasajeros * Precio_pasa * iviajenec;
        //Pago de conductor a propietario
        dinero_prop = Precio_prop * iviajenec;
     
        
                  
       // 3. Mostrar datos de salida
        System.out.println("Cantidad de viajes" + iviajenec);
        System.out.println("Dinero total a pagar por parte de los turistas" + dinero_tur);
        System.out.println("Dinero total a pagar al propietario" + dinero_prop);
                                 
      
         
  } //Fin de la clase principal
}