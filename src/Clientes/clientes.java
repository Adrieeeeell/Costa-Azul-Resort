/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Student
 */
public class clientes {
    private String id;
    private String nombre;
    private LocalDate fecha;
    private String telefono;
    private String correo;
    private String procedencia;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public int CalcularEdad(LocalDate fecha){
       return Period.between(fecha,LocalDate.now()).getYears();}
    

    public clientes(String id, String nombre, LocalDate fecha, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.telefono = telefono;
        this.correo = correo;
         this.procedencia ="Nacional";
    }
    @Override
    public String toString() {
        return "clientes" +"id:"+ id + " nombre:" + nombre + ", fecha:" + this.CalcularEdad(fecha)+ " telefono:" + telefono + ", correo;" + correo + " procedencia:" + procedencia;
    }
    
}

