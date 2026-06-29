/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alojamientos;

/**
 *
 * @author Student
 */
public abstract class Alojamiento {
    protected int codigo;
    protected String nombre;
    protected int capacidadMaxima;
    protected int precioPorNoche;
    protected boolean disponible;

    public Alojamiento(int codigo, String nombre, int capacidadMaxima, int precioPorNoche, boolean disponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.precioPorNoche = precioPorNoche;
        this.disponible = disponible;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getPrecioPorNoche() {
        return precioPorNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setPrecioPorNoche(int precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }
}
