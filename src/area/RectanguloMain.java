
package area;

import java.util.Scanner;

public class RectanguloMain {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce la Base = ");
        int base = entrada.nextInt();
        
        System.out.print("Introduce la Altura = ");
        int altura = entrada.nextInt();
        
        Rectangulo enviar = new Rectangulo(altura, base);
        enviar.CalcularArea();
        enviar.Imprimir();
        
    }
    
}
