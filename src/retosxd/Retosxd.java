/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retosxd;

import java.util.Scanner;


public class Retosxd {

    
    
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        /*float juan, camila, ricardo;
        
        System.out.println("Ingrese el dinero de Juan: ");
        juan = teclado.nextFloat();
        
        camila = juan / 2;
        
        ricardo = (camila + juan)/2;
        
        System.out.println("La cantidad de dinero que tiene juan es " + juan +
                ". La cantidad de dinero que tiene Camila es " + camila +
                ". Y la cantidad que posee Ricardo es " + ricardo );*/
        
        
        final int SALARIO_BASICO = 3500000, COMISION = 1500000;
        double deducciones = COMISION * 5 / 100;
        int cantVentas;
        double slrFinal;
        
        System.out.println("Ingrese la cantidad de ventas realizadas: ");
        cantVentas = teclado.nextInt();
        
        deducciones = deducciones * cantVentas;
        
        slrFinal = SALARIO_BASICO + ((COMISION * cantVentas) - deducciones);
        
        System.out.println("El salario final del empleado es: " + slrFinal);
        
        
        
    }
    
}
