package com.empresa.gestion.service;

import com.empresa.gestion.model.Empleado;

public class NominaService {
    
    /**
     * Multiplica el salario por 12 y lo retorna para calcular el salario anual.
     */
    public double calcularSalarioAnual(Empleado empleado){
        return empleado.getSalario() * 12;
    }
}
