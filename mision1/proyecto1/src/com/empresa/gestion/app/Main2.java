package com.empresa.gestion.app;

import com.empresa.gestion.model.Empleado;
import com.empresa.gestion.service.EmpleadoService;
import java.util.Scanner;

public class Main2 {


    static EmpleadoService empleadoService = new EmpleadoService();
    static Scanner scanner = new Scanner(System.in);


    private static void agregarEmpleado() {

        System.out.println("\n--- AGREGANDO EMPLEADO ---");
        // Implementar lógica para agregar
        System.out.println("Id del empleado: ");
        int id = scanner.nextInt();
        System.out.println("");

        System.out.println("Nombre: ");
        String nombre = scanner.next();
        System.out.println("");

        System.out.println("Edad: ");
        int edad = scanner.nextInt();
        System.out.println("");

        System.out.println("Género: ");
        char genero = scanner.next().charAt(0);
        System.out.println("");

        System.out.println("Activo: ");
        boolean activo = scanner.nextBoolean();
        System.out.println("");

        System.out.println("Salario: ");
        double salario = scanner.nextDouble();
        System.out.println("");

        System.out.println("Horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("");

        Empleado nuevoEmpleado = new Empleado(id, nombre, edad, genero, activo, salario, horasTrabajadas);


        empleadoService.agregar(nuevoEmpleado);
    }


    private static int menuEmpleado(){
        int opcion;

        System.out.println("\n ==== MENÚ EMPLEADOS ====");
        System.out.println("1. Agregar");
        System.out.println("2. Listar");
        System.out.println("3. Consultar empleado");
        System.out.println("4. Eliminar");
        System.out.println("0. SALIR");
        System.out.println("Selecciona una opción: ");
        opcion = scanner.nextInt();
        return opcion;
    }
    
    private static void ejecutarOpcion(int opcion){
        switch (opcion) {
            case 1 -> agregarEmpleado();
            case 2 -> {
                System.out.println("\n--- LISTANDO EMPLEADOS ---");
                empleadoService.listarEmpleados();
            }
            case 3 -> {
                System.out.println("\n--- CONSULTANDO EMPLEADO ---");
                System.out.println("Ingrese el id del usuario que quiere consultar:");
                
                empleadoService.consultarEmpleado(scanner.nextInt());
            }
            case 4 -> {
                System.out.println("\n--- ELIMINANDO EMPLEADO ---");
                System.out.println("Escriba el id del empleado a eliminar:");
                int idEmpleado = scanner.nextInt();
                empleadoService.eliminarPorId_correcto(idEmpleado);
            }
            case 0 -> System.out.println("\n¡Hasta luego!");
            default -> System.out.println("\nOpción no válida");
        }

    }



    public static void main(String[] arg) {

        // Crear 3 empleados iniciales
        empleadoService.agregar(new Empleado(1, "Juan García", 35, 'M', true, 2500000, 160));
        empleadoService.agregar(new Empleado(2, "María López", 28, 'F', true, 2200000, 160));
        empleadoService.agregar(new Empleado(3, "Carlos Rodríguez", 42, 'M', true, 3000000, 160));

        int opcion;
        do { 
            opcion = menuEmpleado();
            ejecutarOpcion(opcion);
        } while (opcion != 0);



        scanner.close();
    }

}
