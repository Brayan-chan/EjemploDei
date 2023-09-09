package ejemplodei;

import java.util.Scanner;


public class EjemploDei {

    public static void main(String[] args) {
        System.out.println("Esto es un ejemplo de historial de versiones");
        System.out.println("Creemos una clase pues para checar que onda");
        
        System.out.println("Esto es un cambio");
        
        Scanner scanner = new Scanner(System.in);
        
        Examp examp = new Examp("Brayan", "isc", 71392, 3, 'B');
        //datosAlumno = examp("Brayan", "isc", 71392, 3, 'B');
        
        System.out.println(examp.getNombre());
        System.out.println(examp.getCarrera());
        System.out.println(examp.toString());
    }
    
}
