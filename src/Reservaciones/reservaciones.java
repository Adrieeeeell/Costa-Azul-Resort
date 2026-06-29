/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservaciones;

import Alojamientos.Alojamiento;
import Clientes.clientes;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Student
 */
public class reservaciones {

    private Alojamiento alojamiento;
    private clientes cliente;
    private LocalDate fingreso;
    private LocalDate fsalida;
    private boolean estado;
    private int totalnoches;

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public clientes getCliente() {
        return cliente;
    }

    public LocalDate getFingreso() {
        return fingreso;
    }

    public LocalDate getFsalida() {
        return fsalida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setCliente(clientes cliente) {
        this.cliente = cliente;
    }

    public reservaciones(Alojamiento alojamiento, clientes cliente, LocalDate fingreso, LocalDate fsalida, boolean estado) {
        this.alojamiento = alojamiento;
        this.cliente = cliente;
        this.fingreso = fingreso;
        this.fsalida = fsalida;
        this.estado = estado;
    }

    public int calcularNoches(LocalDate fingreso) {
       Period.between(fingreso, LocalDate.now()).getDays();{
    }
       return totalnoches;
    }

    public boolean verificarEstado() {
        if (this.isEstado() == true) {
            System.out.println("Pago");
        }
        if (this.isEstado() == false){
        System.out.println("Pendiente");
    }
        return estado;
}
    @Override
    public String toString() {
        return "reservaciones{" + "alojamiento=" + alojamiento + ", cliente=" + cliente + ", fingreso=" + fingreso + ", fsalida=" + fsalida + ", estado=" + estado + "Total de noches" + this.totalnoches+ '}';
    }
}
