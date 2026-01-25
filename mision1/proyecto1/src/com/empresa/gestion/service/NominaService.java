package com.empresa.gestion.service;

import com.empresa.gestion.model.Empleado;

public class NominaService {
    
    /**
     * Multiplica el salario por 12 y lo retorna para calcular el salario anual.
     */
    public double calcularSalarioAnual(Empleado empleado){
        return empleado.getSalario() * 12;
    }

    public double calcularTotalNomina(double[] salarios){
        double total = 0;
        for(int i = 0; i < salarios.length; i++){
            total = total + salarios[i];
        }
        return total;
    }
}
