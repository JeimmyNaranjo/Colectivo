
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
        // Datos de entrada: 
        // 1. Definicion de variables
        // Datos de entrada
        int capacidad,pasajeros;
    
        // Datos de salida
        double dinero_tur,dinero_prop;
        double viajenec;
      
        
        //Variables adicionales
        double Precio_pasa = 10000; // Precio por pasajero
        double Precio_prop = 2000;  //Precio al propietario
        
        
        
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese la capacidad del colectivo\n");
        capacidad = teclado.nextInt();
        System.out.print("Ingrese la cantidad de personas a transportar\n");
        pasajeros = teclado.nextInt();
       
        
        
        // 2. Realizar calculos
        // cantidad de viajes necesarios
        double ipasajeros = (double)pasajeros;
        double icapacidad = (double)capacidad;
        viajenec = Math.ceil(ipasajeros / icapacidad);// Redondear
        int iviajenec = (int)viajenec; //convertir la variable double a entera
        //Pago de turistas a colectivo
        dinero_tur = ipasajeros * Precio_pasa * iviajenec;
        int idinero_tur = (int)dinero_tur;
        //Pago de conductor a propietario
        dinero_prop = Precio_prop * iviajenec;
        int idinero_prop = (int)dinero_prop;
     
        
                  
       // 3. Mostrar datos de salida
        System.out.println("Cantidad de viajes " + iviajenec);
        System.out.println("Dinero total a pagar por parte de los turistas " + idinero_tur);
        System.out.println("Dinero total a pagar al propietario " + idinero_prop);
                                 
      
         
  } //Fin de la clase principal
}
