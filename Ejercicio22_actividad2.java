
package com.mycompany.ejercicio22_actividad2;

import java.util.Scanner;

public class Ejercicio22_actividad2 {

    public static void main(String[] args) {
       
       Scanner leerporteclado = new Scanner(System.in);
       
       double salarioh, hrs, salario;
       String name;
       
       System.out.print("Ingrese  nombre del empleado: ");
       name = leerporteclado.nextLine();
       
       System.out.print("Ingrese el salario basico por hora del empleado: ");
       salarioh = leerporteclado.nextDouble();
        
       System.out.print("Ingrese el numero de horas trabajadas al mes por el empleado: ");
       hrs = leerporteclado.nextDouble(); 
       
       salario = hrs*salarioh;
       
       if (salario > 450000){
           System.out.print("El nombre del empleado es "+name+" y su salario es: $"+salario);
       }else{
           System.out.print("El nombre del empleado es: "+name);
       }
    }
}
