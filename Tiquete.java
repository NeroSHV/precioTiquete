import java.util.Scanner;

public class Tiquete {
    public static void main(String[] args) {
       
       final int PRECIO_BASE = 1000000;
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner viajeAn = new Scanner(System.in);
        
        // Solicitar la edad de Ana
        System.out.print("Ingrese la edad de Ana: ");
        int edad = viajeAn.nextInt();
        
       
        int precioTiquete;
        
        if (edad < 2) {
            System.out.println("Ana no puede viajar en avión.");
           precioTiquete = 0;
        } else if (edad >= 2 && edad < 5) {
            precioTiquete = 0;
            System.out.println("El tiquete es gratis");
        } else if (edad >= 5 && edad < 11) {
            precioTiquete = PRECIO_BASE / 2; // 1/2 precio
            System.out.println("Ana puede viajar");
        } else if (edad >= 11 && edad < 15) {
            precioTiquete = (3 * PRECIO_BASE) / 4; // 3/4 precio
            System.out.println("Ana puede viajar");
        } else {
            precioTiquete = PRECIO_BASE; // Precio normal
        }
        
        
        if (precioTiquete == 0) {
            
        } else {
            System.out.println("El precio del tiquete es: $" + precioTiquete);
        }
        
        viajeAn.close();
    }
}

