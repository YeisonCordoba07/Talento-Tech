package com.empresa.gestion.service;

import com.empresa.gestion.model.Empleado;
import java.util.ArrayList;

public class EmpleadoService {

    private ArrayList<Empleado> empleados = new ArrayList<>();





    public void agregar(Empleado nuevoEmpleado){
        this.empleados.add(nuevoEmpleado);
    }



    public void elminarPorId_incorrecto(int id){
        for(Empleado e: empleados){
            if(e.getId() == id){
                empleados.remove(empleados.indexOf(e));
                System.out.println("Empleado eliminado correctamente");
                return;
            }
        }
    }

    public void eliminarPorId_correcto(int id){
        empleados.removeIf(e -> e.getId() == id);
    }



    public void listarEmpleados(){
        if(empleados.isEmpty()){
            System.out.println("-- No hay empleados registrados.");
        }

        for (Empleado e : empleados) {
            System.out.println(e.resumen());
        }

        
    }
}
