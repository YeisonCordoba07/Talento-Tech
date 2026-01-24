package com.empresa.gestion.model;

public class Empleado extends Persona{
    private double salario;
    private int horasTrabajadas;



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

    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }




    @Override
    public void presentarse() {
        System.out.println("Soy el empleado " + getNombre() + " y mi salario es " + salario);
    }



    public double calcularSalarioMensual(){
        double valorHora = salario / 160;
        double salarioFinal = valorHora * horasTrabajadas;
        return salarioFinal;
    }

    public boolean esMayorDeEdad(){

        return getEdad() >= 18;
    }

    public boolean puedeTrabajar(){
        return esMayorDeEdad() && isActivo();
    }

    
}
