package com.empresa.gestion.model;

public class Persona {
    private String nombre;
    private int edad;
    private boolean activo;
    private char genero;



    public Persona(String nombre, int edad, boolean activo, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.activo = activo;
        this.genero = genero;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }



    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public boolean isActivo(){
        return activo;
    }

    public void setActivo(boolean activo){
        this.activo = activo;
    }

    public char getGenero(){
        return genero;
    }

    public void setGenero(char genero){
        this.genero = genero;
    }

    public void mostrarInformacionBasica(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Activo: " + activo);
        System.out.println("Genero: " + genero);
    }

    public void presentarse(){
        System.out.println("hola, me llamo " + nombre +" y tengo " + edad  + " años.");
    }
}
