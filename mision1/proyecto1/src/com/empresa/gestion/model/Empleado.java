package com.empresa.gestion.model;

public class Empleado extends Persona{
    private double salario;



    public Empleado(String nombre, int edad, double salario, boolean activo, char genero){
        super(nombre, edad, activo, genero);
        this.salario = salario;
    }



    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }



    @Override
    public void presentarse() {
        System.out.println("Soy el empleado " + getNombre() + " y mi salario es " + salario);
    }

    
}
