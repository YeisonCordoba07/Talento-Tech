package com.empresa.gestion.model;

public class Persona {
    protected String nombre;
    protected int edad;
    protected boolean activo;
    protected char genero;
    protected int id;



    public Persona(int id, String nombre, int edad, boolean activo, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.activo = activo;
        this.genero = genero;
        this.id = id;
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

    public int getId(){
        return this.id;
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
