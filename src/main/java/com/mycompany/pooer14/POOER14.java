package com.mycompany.pooer14;
import java.util.Scanner;
/**
 *
 * @author JuliRuizOcampo
 */
public class POOER14 {

    public static void main(String[] args) {
        int vd1, vd2, vd3, totven;
        double salar, porven, salar1, salar2, salar3;
        
        /*
        vd1: Ventas del departamento 1, vd2: Ventas del departamento 2,  vd3: Ventas del departamento 3 
        salar: Salario que reciben vendedores en cada departamento, totven: Total ventas en la empresa, 
        porven: Porcentaje equivalente al 33% de ventas totales,  salar1: Salario de los vendedores en el depto. 1, 
        salar2: Salario de los vendedores en el depto. 2, salar3: Salario de los vendedores en el depto. 3
        */
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento 1: ");
        vd1 = lector.nextInt();
        System.out.println("Ingrese las ventas del departamento 2: ");
        vd2 = lector.nextInt();
        System.out.println("Ingrese las ventas del departamento 3: ");
        vd3 = lector.nextInt();
        System.out.println("Ingrese el salario de los vendedores de cada departamento");
        salar = lector.nextDouble();
        
        totven = vd1 + vd2 + vd3;
        porven = 0.33 * totven;
        
        //Departamento 1
        if (vd1 > porven) {
            salar1 = salar * 1.2;    
        } 
        else {
            salar1 = salar;
        }
        
        //Departamento 2
        if (vd2 > porven) {
            salar2 = salar * 1.2;    
        } 
        else {
            salar2 = salar;
        }
        
        //Departamento 3
        if (vd3 > porven) {
            salar3 = salar * 1.2;  
        } 
        else {
            salar3 = salar;
        }
        
        System.out.println("Salario vendedores Departamento 1: " + salar1);
        System.out.println("Salario vendedores Departamento 2: " + salar2);
        System.out.println("Salario vendedores Departamento 3: " + salar3);   
    }
}