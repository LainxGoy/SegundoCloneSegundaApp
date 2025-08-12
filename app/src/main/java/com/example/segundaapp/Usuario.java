package com.example.segundaapp;

public class Usuario {
    private String Nombre;
    private String Apellido;
    private String Contraseña;
    private String Correo;
    private String Telefono;

    public Usuario(String nombre, String apellido, String contraseña, String correo, String telefono) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Contraseña = contraseña;
        this.Correo = correo;
        this.Telefono = telefono;
    }


    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
