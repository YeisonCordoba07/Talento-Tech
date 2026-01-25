package com.empresa.gestion.app;

import com.empresa.gestion.model.*;
import com.empresa.gestion.service.NominaService;


public class Main {

    public static void main(String[] args){
        Empleado empleado1 = new Empleado("Yeison", 18, 'M', true, 3200.0, 160);

        Gerente gerente1 = new Gerente("Juan", 40, 'M', true, 5000.0, 160, "SRE", 1000.0);

        empleado1.presentarse();
        gerente1.presentarse();

        NominaService nomina = new NominaService();

        System.out.println("Salario empleado: $" + nomina.calcularSalarioAnual(empleado1));
        System.out.println("Salario gerente: $" + nomina.calcularSalarioAnual(gerente1));
    }
    
}
