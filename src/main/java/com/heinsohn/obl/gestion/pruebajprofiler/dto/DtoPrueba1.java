package com.heinsohn.obl.gestion.pruebajprofiler.dto;

public class DtoPrueba1 {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;


    public DtoPrueba1() {
    }


    public DtoPrueba1(String nombre, String apellido, int edad, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return this.cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }


}
