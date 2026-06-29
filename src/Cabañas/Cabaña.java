/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cabañas;

import Alojamientos.Alojamiento;
import Reservaciones.reservaciones;
/**
 *
 * @author Student
 */
public class Cabaña extends Alojamiento{
    
    private int tamañoMetrosCuadrados;
    private boolean tienePiscina;
    private String tipoAlojamientoC;
    private int totalPorNoche;

    public Cabaña(int codigo, String nombre, int capacidadMaxima, int precioPorNoche, boolean disponible) {
        super(codigo, nombre, capacidadMaxima, precioPorNoche, disponible);
    }
    

    public Cabaña(int tamañoMetrosCuadrados, boolean tienePiscina, String tipoCabaña, int codigo, String nombre, int capacidadMaxima, int precioPorNoche, boolean disponible) {
        super(codigo, nombre, capacidadMaxima, precioPorNoche, disponible);
        this.tamañoMetrosCuadrados = tamañoMetrosCuadrados;
        this.tienePiscina = tienePiscina;
        this.tipoAlojamientoC = "Normal";
        this.precioPorNoche = 2000;
        this.capacidadMaxima = 10;
    }
@Override
    public int getPrecioPorNoche() {
        return precioPorNoche;
    }
@Override
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
@Override
    public int getCodigo() {
        return codigo;
    }
@Override
    public String getNombre() {
        return nombre;
    }
@Override
    public boolean isDisponible() {
        return disponible;
    }
    public int getTamañoMetrosCuadrados() {
        return tamañoMetrosCuadrados;
    }

    public boolean isTienePiscina() {
        return tienePiscina;
    }

    public String getTipoCabaña() {
        return tipoAlojamientoC;
    }
    public double calcularNochesPorImpuesto(int calcularNoches){
        totalPorNoche = (int) ((precioPorNoche*calcularNoches)*0.13+(precioPorNoche*calcularNoches));
        return totalPorNoche;
    }
    public String calcularAmplitud(int tamañoMetrosCuadrados, String tipoCabaña){
        if (tamañoMetrosCuadrados>80){
            tipoCabaña = "Amplia";
            return tipoCabaña;
    }
return tipoCabaña;
}

    @Override
    public String toString() {
        return "Numero:"+codigo+"Nombre:"+nombre+"CapacidadMaxima:"+capacidadMaxima+"precio Por Noche:"+precioPorNoche+"disponible:"+disponible+"MetrosCuadrados=" + tamañoMetrosCuadrados + ", tienePiscina=" + tienePiscina + ", tipoAlojamientoC=" + tipoAlojamientoC + "Total por noche:"+totalPorNoche;
    }
    
}