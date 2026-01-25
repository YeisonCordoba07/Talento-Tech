package com.empresa.gestion.model;

public class Gerente extends Empleado{
    private String departamento;
    private double bono;

    public Gerente(String nombre, int edad, double salario, String departamento, boolean activo, char genero) {
        super(nombre, edad, salario, activo, genero);
        this.departamento = departamento;
    }



    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    
    @Override
    public void presentarse() {
        System.out.println("Soy el gerente " + getNombre()  + " y estoy a cargo del departamento de " + departamento);
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

}
