package com.company;

public class USUARIO {
 //Atributos
   private String nombre;
   private String contraseña;
   private String direccion;
   private String celular;
   private String DNI;
   private String nacionalidad;

   //Constructores
    public USUARIO(String nombre)
    {this.nombre = nombre;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.celular = celular;
        this.DNI = DNI;
        this.nacionalidad = nacionalidad;
    }
    // Set and get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
