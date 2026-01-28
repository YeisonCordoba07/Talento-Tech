package com.empresa.gestion.model;

public class Empleado extends Persona {
    private double salario;
    private int horasTrabajadas;


    public Empleado(int id, String nombre, int edad, char genero, boolean activo, double salario, int horasTrabajadas) {
        super(id, nombre, edad, activo, genero);
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy el empleado " + getNombre() + " y mi salario es " + salario);
    }

    public double calcularSalarioMensual() {
        double valorHora = salario / 160;
        double salarioFinal = valorHora * horasTrabajadas;
        return salarioFinal;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public boolean puedeTrabajar() {
        return esMayorDeEdad() && isActivo();
    }



    public String clasificarEmpleado(){
        if(edad < 18){
            return "Menor de edad (No puede trabajar)";
        }
        else if(edad <= 60){
            return "Empleado activo";
        }else{
            return "Empleado en edad de retiro";
        }
    }

    public String obtenerTipoEmpleado(){
        return switch (genero) {
            case 'M' -> "Masculino";
            case 'F' -> "Femenino";
            default -> "No especificado";
        };
    }

    public String resumen(){
        String informacion = "Id: " + this.id + "\nNombre: " + this.nombre + "\nEdad: "+ this.edad;
        return informacion;
    }
}
