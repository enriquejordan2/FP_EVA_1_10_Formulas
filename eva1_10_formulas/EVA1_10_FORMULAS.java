/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_10_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dis,vo,ac,t;
        Scanner captu = new Scanner(System.in);
        
        //Formula
        System.out.println("Velocidad inicial: ");
        vo = captu.nextDouble();
        System.out.println("Tiempo: ");
        t = captu.nextDouble();
        System.out.println("Aceleracion: ");
        ac = captu.nextDouble();
        dis = vo*t + (ac*t*t)/2;
        System.out.println("Distancia = "+ dis);
    }
    
}
