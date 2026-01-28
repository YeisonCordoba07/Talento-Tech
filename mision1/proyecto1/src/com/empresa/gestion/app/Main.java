package com.empresa.gestion.app;

import com.empresa.gestion.model.*;
import com.empresa.gestion.service.EmpleadoService;
import com.empresa.gestion.service.NominaService;

public class Main {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Yeison", 18, 'M', true, 3200.0, 160);
        Empleado empleado2 = new Empleado(2, "María", 28, 'F', true, 3500.0, 160);
        Empleado empleado3 = new Empleado(3, "Carlos", 35, 'M', true, 3800.0, 160);
        Empleado empleado4 = new Empleado(4, "Ana", 25, 'F', true, 3300.0, 160);
        Empleado empleado5 = new Empleado(5, "Pedro", 42, 'M', true, 4000.0, 160);
        Empleado empleado6 = new Empleado(6, "Laura", 30, 'F', true, 3600.0, 160);

        Gerente gerente1 = new Gerente(20, "Juan", 40, 'M', true, 5000.0, 160, "SRE", 1000.0);

        EmpleadoService empleadoService = new EmpleadoService();

        empleadoService.agregar(empleado1);
        empleadoService.agregar(empleado2);
        empleadoService.agregar(empleado3);
        empleadoService.agregar(empleado4);
        empleadoService.agregar(empleado5);
        empleadoService.agregar(empleado6);

        empleadoService.listarEmpleados();
        empleadoService.eliminarPorId_correcto(3);
        empleadoService.listarEmpleados();

    }

    public void imprimirInformacion(Empleado empleado1, Gerente gerente1) {
        System.out.println("=== INFORMACIÓN EMPLEADO ===");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Edad: " + empleado1.getEdad());
        System.out.println("Género: " + empleado1.getGenero());
        System.out.println("Activo: " + empleado1.isActivo());
        System.out.println("Salario: $" + empleado1.getSalario());
        System.out.println("Horas Trabajadas: " + empleado1.getHorasTrabajadas());
        System.out.println("Es Mayor de Edad: " + empleado1.esMayorDeEdad());
        System.out.println("Puede Trabajar: " + empleado1.puedeTrabajar());

        System.out.println("\n=== INFORMACIÓN GERENTE ===");
        System.out.println("Nombre: " + gerente1.getNombre());
        System.out.println("Edad: " + gerente1.getEdad());
        System.out.println("Género: " + gerente1.getGenero());
        System.out.println("Activo: " + gerente1.isActivo());
        System.out.println("Salario: $" + gerente1.getSalario());
        System.out.println("Horas Trabajadas: " + gerente1.getHorasTrabajadas());
        System.out.println("Departamento: " + gerente1.getDepartamento());
        System.out.println("Bono: $" + gerente1.getBono());
        System.out.println("Es Mayor de Edad: " + gerente1.esMayorDeEdad());
        System.out.println("Puede Trabajar: " + gerente1.puedeTrabajar());

        NominaService nomina = new NominaService();

        System.out.println("\n=== CÁLCULO DE SALARIOS ===");
        System.out.println("Salario Mensual Empleado: $" + empleado1.calcularSalarioMensual());
        System.out.println("Salario Mensual Gerente: $" + gerente1.calcularSalarioMensual());
        System.out.println("Salario Anual Empleado: $" + nomina.calcularSalarioAnual(empleado1));
        System.out.println("Salario Anual Gerente: $" + nomina.calcularSalarioAnual(gerente1));
    }

}
